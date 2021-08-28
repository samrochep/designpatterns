package com.sam.design_patterns.iterator;

import java.util.Iterator;

public interface Menu {
	
	Iterator<MenuItem> createIterator();
	String getName();

}
