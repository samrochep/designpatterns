package com.sam.design_patterns.iterator;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

@Service
public class IteratorPatternTestApp {
	
	@Autowired
	@Qualifier("breakFastMenu")
	BreakFastMenu breakFastMenu;
	
	@Autowired
	@Qualifier("dinnerMenu")
	DinnerMenu dinnerMenu;
	
	public void testIteratorPattern() {
		ArrayList<Menu> menus = Lists.newArrayList(breakFastMenu,dinnerMenu);
		RestaurantApp restaurantApp = new RestaurantApp(menus);
		restaurantApp.printMenu();
	}

}
