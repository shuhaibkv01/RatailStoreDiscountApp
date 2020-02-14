package com.xyz.retailstore.service;

import com.xyz.retailstore.constants.CommonConstants;

public class AffiliateDiscount implements iDiscount {

	@Override
	public double calculateDiscountAmount(double amount) {
		return amount * CommonConstants.AFFILIATE_DISCOUNT_PERC / 100;
	}
	
}
