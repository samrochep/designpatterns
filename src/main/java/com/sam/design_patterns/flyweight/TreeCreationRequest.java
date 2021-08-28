package com.sam.design_patterns.flyweight;

public class TreeCreationRequest {
	
	private int reqId;
	private String treeName;
	private String treeColor;
	private int noOfTrees;
	
	public int getReqId() {
		return reqId;
	}
	public void setReqId(int reqId) {
		this.reqId = reqId;
	}
	public String getTreeName() {
		return treeName;
	}
	public void setTreeName(String treeName) {
		this.treeName = treeName;
	}
	public String getTreeColor() {
		return treeColor;
	}
	public void setTreeColor(String treeColor) {
		this.treeColor = treeColor;
	}
	public int getNoOfTrees() {
		return noOfTrees;
	}
	public void setNoOfTrees(int noOfTrees) {
		this.noOfTrees = noOfTrees;
	}
}
