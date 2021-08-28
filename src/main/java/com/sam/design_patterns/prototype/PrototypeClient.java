package com.sam.design_patterns.prototype;


import org.springframework.stereotype.Service;

@Service
public class PrototypeClient {
	
	public void process() throws CloneNotSupportedException{
		processA();
		processB();
		processC();
		processD();
	}
	
	private void processA() throws CloneNotSupportedException{
		System.out.println("processA======");
		Circle circle1 = (Circle)((Circle) ShapeRegistry.getShape(000)).clone();
		
		System.out.println("circle1 with default======");
		circle1.draw();
		
		circle1.setRadius(10);
		/*System.out.println("circle1 x "+circle1.getX());
		System.out.println("circle1 y "+circle1.getY());
		System.out.println("circle1 radius "+circle1.getRadius());
		System.out.println("circle radius "+((Circle)ShapeRegistry.getShape(000)).getRadius());*/
		System.out.println("circle1======");
		circle1.draw();
		Circle circle = ((Circle)ShapeRegistry.getShape(000));
		System.out.println("circle======");
		circle.draw();
	}
	
	/*private void processB() throws CloneNotSupportedException{
		System.out.println("processB======");
		Circle circle2 = (Circle)((Circle) ShapeRegistry.getShape(001)).clone();
		circle2.setRadius(20);
		System.out.println("circle2 x "+circle2.getX());
		System.out.println("circle2 y "+circle2.getY());
		System.out.println("circle2 radius "+circle2.getRadius());
		System.out.println("circle radius "+((Circle)ShapeRegistry.getShape(000)).getRadius());
		circle2.draw();
	}
	*/
	private void processB() throws CloneNotSupportedException{
		System.out.println("processB======");
		Circle circle2 = (Circle)((Circle) ShapeRegistry.getShape(001)).clone();
		//Parameter paramaterOfCircleWithParamObj = circle2.getParameter();
		
		System.out.println("circle2 with default======");
		circle2.drawWithParamterObj();
		
		circle2.setRadius(30);
		Parameter parameter2 = circle2.getParameter();
		parameter2.setX(4);
		parameter2.setY(5);
		
		/*System.out.println("circle4 radius "+circle2.getRadius());
		System.out.println("circle radius "+circle2.getRadius());*/
		
		/*System.out.println("parameter4 x "+parameter2.getX());
		System.out.println("parameter4 y "+parameter2.getY());
		
		System.out.println("paramaterOfCircleWithParamObj x "+paramaterOfCircleWithParamObj.getX());
		System.out.println("paramaterOfCircleWithParamObj y "+paramaterOfCircleWithParamObj.getY());*/
		System.out.println("circle2 with param obj======");
		circle2.drawWithParamterObj();
		System.out.println("circle======");
		((Circle)ShapeRegistry.getShape(001)).drawWithParamterObj();
	}
	
	private void processC() {
		System.out.println("processC======");
		Rectangle rectangle1 = new Rectangle((Rectangle)ShapeRegistry.getShape(002));
		System.out.println("rectangle1 with default======");
		rectangle1.draw();
		rectangle1.getParameter2().setY(25);
		System.out.println("rectangle1======");
		rectangle1.draw();
		Rectangle rectangle = (Rectangle)ShapeRegistry.getShape(002);
		System.out.println("rectangle======");
		rectangle.draw();
	}
	
	private void processD() {
		System.out.println("processD======");
		Rectangle rectangle2 = new Rectangle((Rectangle)ShapeRegistry.getShape(003));
		System.out.println("rectangle2 with default======");
		rectangle2.draw();
		rectangle2.getParameter2().setY(45);
		System.out.println("rectangle2======");
		rectangle2.draw();
		Rectangle rectangle = (Rectangle)ShapeRegistry.getShape(003);
		System.out.println("rectangle======");
		rectangle.draw();
	}
	
	

}
