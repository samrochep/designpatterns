package com.sam.design_patterns.remoteproxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Search extends Remote{
	String query(String searchQuery) throws RemoteException;

}
