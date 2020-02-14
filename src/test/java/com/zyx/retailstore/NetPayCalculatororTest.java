package com.zyx.retailstore;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.xyz.retailstore.model.BillDetails;
import com.xyz.retailstore.model.PurchaseType;
import com.xyz.retailstore.model.User;
import com.xyz.retailstore.model.UserType;
import com.xyz.retailstore.service.NetPayCalculatoror;

public class NetPayCalculatororTest {
	
	@Test
	public void calculateEmployeeNetPay() {
		NetPayCalculatoror netPayCalculatoror = new NetPayCalculatoror();
		
		BillDetails billDetails = new BillDetails();
		billDetails.setUser(new User(1, UserType.EMPLOYEE, 2019));
		billDetails.setPurchaseType(PurchaseType.GARMENTS);
		billDetails.setTotalAmount(950);
		
		assertTrue(620.0 == netPayCalculatoror.getNetPayAmount(billDetails));
	}

}
