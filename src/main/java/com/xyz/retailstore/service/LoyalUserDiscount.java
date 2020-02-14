package com.xyz.retailstore.service;

import com.xyz.retailstore.constants.CommonConstants;

public class LoyalUserDiscount implements iDiscount {

	@Override
	public double calculateDiscountAmount(double amount) {
		return amount * CommonConstants.LOYAL_DISCOUNT_PERC / 100;
	}
}
