package com.sam.design_patterns.prototype;

import java.util.LinkedList;

public class Circle extends HashMap{
	
	private int id;
	
	private int x;
	private int y;
	private int radius;
	
	
	
	private Parameter parameter = new Parameter();
	
	//so many complex data members
	
	//some complex db calls
	Circle(int id,int x,int y){
		this.id=id;
		this.x=x;
		this.y=y;
		this.radius=5;
	}
	
	
	public Parameter getParameter() {
		return parameter;
	}


	public void setParameter(Parameter parameter) {
		this.parameter = parameter;
	}


	Circle(Circle circle) {
		this.id=circle.id;
		this.x=circle.x;
		this.y=circle.y;
	}
	
	public Circle(int id,Parameter parameter) {
		this.id=id;
		this.parameter.setX(parameter.getX());
		this.parameter.setY(parameter.getY());
	}



	protected Object clone() throws CloneNotSupportedException{
		Circle circle = (Circle) super.clone();
		circle.parameter=(Parameter) this.parameter.clone();
		return circle;	
	}

	@Override
	public void draw() {
		System.out.println("drawing a circle with id "+this.id+"==> "+this.x+","+this.y+","+this.radius);
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void drawWithParamterObj(){
		System.out.println("drawing a circle with id "+this.id+"==> "+this.parameter.getX()
		+","+this.parameter.getY()+","+this.radius);
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

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}
