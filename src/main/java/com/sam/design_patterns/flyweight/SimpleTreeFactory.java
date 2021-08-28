package com.sam.design_patterns.flyweight;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.google.common.collect.Maps;

@Service
public class SimpleTreeFactory {
	
	private Map<String,TreeType> treeTypeMap = Maps.newHashMap();
	
	public Tree getTree(TreeCreationRequest request) {
		Tree tree = null;
		if(request!=null) {
			tree = new Tree();	
			String treeName = request.getTreeName();
			TreeType treeType = treeTypeMap.get(treeName);
			if(treeType!=null) {
				tree.setTreeType(treeType);
			} else {
				treeType = new TreeType();
				treeType.setName(treeName);
				treeType.setColor(request.getTreeColor());
				tree.setTreeType(treeType);
				treeTypeMap.put(treeName, treeType);
				HeapMemoryTracker.increment();
			}
		}
		return tree;
	}

}
