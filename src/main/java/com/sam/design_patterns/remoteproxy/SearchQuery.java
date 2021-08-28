package com.sam.design_patterns.remoteproxy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import com.google.common.collect.Lists;

public class SearchQuery extends UnicastRemoteObject implements Search {
	
	private static final long serialVersionUID = 1827495052068904012L;
	
	private static List<String> queries = Lists.newArrayList();
    
	static {
		queries.add("Is Collections part of Java");
		queries.add("Is directive  part of Angular");
		queries.add("Is Proxy pattern  part of Design patterns");
	}
	protected SearchQuery() throws RemoteException {
		super();
	}

	@Override
	public String query(String searchQuery) throws RemoteException {
		return queries.contains(searchQuery)?"YES":"NO";
	}

}
