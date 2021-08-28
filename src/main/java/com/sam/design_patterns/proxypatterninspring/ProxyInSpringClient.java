package com.sam.design_patterns.proxypatterninspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProxyInSpringClient {
	
	@Autowired
	private NumericOperation numericOperation;
	
	public int sumOfNNumbers(int n) {
		System.out.println(numericOperation.getClass().getName());
		return numericOperation.sumOfNNumber(n);
	}
	
	

}
