package com.sam.design_patterns.flyweight;

public class Tree {

	private TreeType treeType;
	private int xAxis;
	private int yAxis;
	
	
	public TreeType getTreeType() {
		return treeType;
	}

	public void setTreeType(TreeType treeType) {
		this.treeType = treeType;
	}

	public int getxAxis() {
		return xAxis;
	}

	public void setxAxis(int xAxis) {
		this.xAxis = xAxis;
	}

	public int getyAxis() {
		return yAxis;
	}

	public void setyAxis(int yAxis) {
		this.yAxis = yAxis;
	}

	public void display() {
		System.out.println("The tree " + this.treeType.getName() + " with the color " + this.treeType.getColor() + " is planted at " + this.xAxis + ","
				+ this.yAxis);
	}

}
