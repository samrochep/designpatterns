package com.sam.design_patterns.proxypatterninspring;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class NumericOperationImpl implements NumericOperation {

	@Override
	@Cacheable("n")
	public int sumOfNNumber(int n) {
		int sum =0;
		for(int i=1;i<=n;i++){
			sum=sum+i;
		}
		return sum;
	}

}
