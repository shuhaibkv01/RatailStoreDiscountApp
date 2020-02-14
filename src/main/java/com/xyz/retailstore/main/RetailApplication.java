package com.xyz.retailstore.main;

import com.xyz.retailstore.model.BillDetails;
import com.xyz.retailstore.model.PurchaseType;
import com.xyz.retailstore.model.User;
import com.xyz.retailstore.model.UserType;
import com.xyz.retailstore.service.NetPayCalculatoror;

public class RetailApplication {

	public static void main(String[] args) {

		BillDetails billDetails = new BillDetails();

		billDetails.setUser(new User(1, UserType.EMPLOYEE, 2019));
		billDetails.setPurchaseType(PurchaseType.GARMENTS);
		billDetails.setTotalAmount(950);
		NetPayCalculatoror netPayCalculatoror = new NetPayCalculatoror();
		System.out.println(netPayCalculatoror.getNetPayAmount(billDetails));
		
	}

}
