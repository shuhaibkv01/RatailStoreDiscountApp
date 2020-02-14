package com.zyx.retailstore;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.xyz.retailstore.model.BillDetails;
import com.xyz.retailstore.model.PurchaseType;
import com.xyz.retailstore.model.User;
import com.xyz.retailstore.model.UserType;
import com.xyz.retailstore.service.DiscountFactory;
import com.xyz.retailstore.service.TotalDiscount;
import com.xyz.retailstore.service.iDiscount;

public class TotalDiscountTest {
	
	@Test
	public void totalDiscountWithoutPercDiscountTest() {
		
		BillDetails billDetails = new BillDetails();
		billDetails.setUser(new User(1, UserType.EMPLOYEE, 2019));
		billDetails.setPurchaseType(PurchaseType.GROCERIES);
		billDetails.setTotalAmount(950);
		iDiscount discount = DiscountFactory.getDiscount(billDetails);
		iDiscount totalDiscount = new TotalDiscount(discount);
		
		assertTrue(45.0 == totalDiscount.calculateDiscountAmount(950));
		
		
	}

}
