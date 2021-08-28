package com.sam.design_patterns.prototype;

import java.util.Map;

import com.google.common.collect.Maps;

public class ShapeRegistry {
	static Map<Integer, Shape> shapeMap;
	static {
		shapeMap = Maps.newHashMap();

		Parameter parameter = new Parameter(2, 3);
		Circle circle1 = new Circle(000, 1, 2);
		Circle circleWithParamObj2 = new Circle(001, parameter);

		Rectangle rectangle1 = new Rectangle(002, 10, 20);
		Rectangle rectangle2 = new Rectangle(003, 15, 40);

		shapeMap.put(circle1.getId(), circle1);
		shapeMap.put(circleWithParamObj2.getId(), circleWithParamObj2);
		shapeMap.put(rectangle1.getId(), rectangle1);
		shapeMap.put(rectangle2.getId(), rectangle2);

	}

	public static Shape getShape(int id) {
		return shapeMap.get(id);
	}

}
