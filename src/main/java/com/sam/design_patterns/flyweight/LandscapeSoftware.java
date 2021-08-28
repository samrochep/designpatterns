package com.sam.design_patterns.flyweight;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LandscapeSoftware {
	
	@Autowired
	private SimpleTreeFactory simpleTreeFactory;
	
	public void plantTree(TreeCreationRequest request) {
		if(request!=null) {		
			for(int i=0;i<request.getNoOfTrees();i++){
				Tree tree = simpleTreeFactory.getTree(request);
				plantTree(tree);
				tree.display();
			}
			System.out.println("No of intrinsic objects created===> "+HeapMemoryTracker.getNoOfObjectsCreated());
		}
	}
	
	private void plantTree(Tree tree) {
		Random random = new Random();
		int xAxis = random.nextInt(100001);
		int yAxis = random.nextInt(100001);
		tree.setxAxis(xAxis);
		tree.setyAxis(yAxis);
	}

}
