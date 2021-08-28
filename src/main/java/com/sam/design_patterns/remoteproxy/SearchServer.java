package com.sam.design_patterns.remoteproxy;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class SearchServer {
	
	public static void main(String arg[]) {
		try {
			Search search = new SearchQuery();
			LocateRegistry.createRegistry(1900);
			Naming.rebind("rmi://localhost:1900/searchTopic", search);
			System.out.println("Search obj has been registered "+search);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
