package com.sam.design_patterns.prototype;

public class Rectangle implements Shape {
	
	private int id;
    private int height;
	private int width;
	private final Parameter parameter2;
	
	Rectangle(int id,int height,int width) {
		this.id = id;
		this.height=height;
		this.width=width;
		parameter2 = new Parameter(height,width);
	}
	
	Rectangle(Rectangle rectangle){
		this.id=rectangle.id;
		this.height=rectangle.height;
		this.width=rectangle.width;
		Parameter parameter = rectangle.getParameter2();
		parameter2 = new Parameter(parameter.getX(),parameter.getY());
	}
	
	public Parameter getParameter2() {
		return parameter2;
	}
    
	@Override
	public void draw() {
		System.out.println("drawing a rectangle with id "+this.id+"==> "+this.parameter2.getX()
		+","+this.parameter2.getY());
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	
}
