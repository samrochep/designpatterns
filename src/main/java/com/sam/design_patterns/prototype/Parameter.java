package com.sam.design_patterns.prototype;

public class Parameter implements Cloneable {
	
	private int x;
	private int y;
	
	public Parameter(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public Parameter() {
		// TODO Auto-generated constructor stub
	}
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

}
