package com.sam.design_patterns.flyweight;

public class HeapMemoryTracker{
	
	public static int objectsCount = 0;
	
	public static void increment() {
		HeapMemoryTracker.objectsCount++;
	}
	public static int getNoOfObjectsCreated() {
		return HeapMemoryTracker.objectsCount;
	}

}
