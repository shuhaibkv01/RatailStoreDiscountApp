package com.xyz.retailstore.service;

import java.time.LocalDate;

import com.xyz.retailstore.model.BillDetails;
import com.xyz.retailstore.model.PurchaseType;
import com.xyz.retailstore.model.UserType;

public class DiscountFactory {

	public static iDiscount getDiscount(BillDetails billDetails) {

		if (PurchaseType.GROCERIES.equals(billDetails.getPurchaseType())) {
			return new NoDiscount();
		} else if (UserType.EMPLOYEE.equals(billDetails.getUser().getUserType())) {
			return new EmployeeDiscount();
		} else if (UserType.AFFILIATE.equals(billDetails.getUser().getUserType())) {
			return new AffiliateDiscount();
		} else if ((LocalDate.now().getYear() - billDetails.getUser().getJoinedYear()) >= 2) {
			return new LoyalUserDiscount();
		} else {
			return new NoDiscount();
		}
	}

}
