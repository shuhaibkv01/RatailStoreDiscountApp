package com.xyz.retailstore.service;

public class NoDiscount implements iDiscount {

	@Override
	public double calculateDiscountAmount(double amount) {
		return 0;
	}
	
}
