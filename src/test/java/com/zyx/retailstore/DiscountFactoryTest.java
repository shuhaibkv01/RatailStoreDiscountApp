package com.zyx.retailstore;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.xyz.retailstore.model.BillDetails;
import com.xyz.retailstore.model.PurchaseType;
import com.xyz.retailstore.model.User;
import com.xyz.retailstore.model.UserType;
import com.xyz.retailstore.service.DiscountFactory;
import com.xyz.retailstore.service.iDiscount;

public class DiscountFactoryTest {

	@Test
	public void groceriesPurchaseTest() {
		BillDetails billDetails = new BillDetails();
		billDetails.setUser(new User(1, UserType.EMPLOYEE, 2019));
		billDetails.setPurchaseType(PurchaseType.GROCERIES);
		billDetails.setTotalAmount(950);
		iDiscount discount = DiscountFactory.getDiscount(billDetails);

		assertTrue((0.0 == discount.calculateDiscountAmount(950)));

	}

	@Test
	public void employeeTypePurchaseTest() {
		BillDetails billDetails = new BillDetails();
		billDetails.setUser(new User(1, UserType.EMPLOYEE, 2019));
		billDetails.setPurchaseType(PurchaseType.GARMENTS);
		billDetails.setTotalAmount(950);
		iDiscount discount = DiscountFactory.getDiscount(billDetails);

		assertTrue((285.0 == discount.calculateDiscountAmount(950)));

	}

	@Test
	public void affiliateTypePurchaseTest() {
		BillDetails billDetails = new BillDetails();
		billDetails.setUser(new User(1, UserType.AFFILIATE, 2019));
		billDetails.setPurchaseType(PurchaseType.GARMENTS);
		billDetails.setTotalAmount(950);
		iDiscount discount = DiscountFactory.getDiscount(billDetails);

		assertTrue((95.0 == discount.calculateDiscountAmount(950)));

	}

	@Test
	public void loyalPurchaseTest() {
		BillDetails billDetails = new BillDetails();
		billDetails.setUser(new User(1, UserType.OTHER, 2017));
		billDetails.setPurchaseType(PurchaseType.GARMENTS);
		billDetails.setTotalAmount(950);
		iDiscount discount = DiscountFactory.getDiscount(billDetails);
		assertTrue((47.5 == discount.calculateDiscountAmount(950)));

	}

	@Test
	public void noPercentageDiscountTest() {
		BillDetails billDetails = new BillDetails();
		billDetails.setUser(new User(1, UserType.OTHER, 2019));
		billDetails.setPurchaseType(PurchaseType.GARMENTS);
		billDetails.setTotalAmount(950);
		iDiscount discount = DiscountFactory.getDiscount(billDetails);
		assertTrue((0.0 == discount.calculateDiscountAmount(950)));

	}

}
