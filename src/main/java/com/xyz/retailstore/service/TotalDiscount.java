package com.xyz.retailstore.service;

import com.xyz.retailstore.constants.CommonConstants;

public class TotalDiscount implements iDiscount {

	iDiscount percDiscount;

	public TotalDiscount(iDiscount perDiscount) {
		this.percDiscount = perDiscount;
	}

	@Override
	public double calculateDiscountAmount(double amount) {
		double pecentageDiscount = percDiscount.calculateDiscountAmount(amount);
		return pecentageDiscount + (int) (amount / 100) * CommonConstants.AMOUNT_DISCOUNT;
	}

}
