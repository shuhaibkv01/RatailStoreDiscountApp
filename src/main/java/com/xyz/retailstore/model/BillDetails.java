package com.xyz.retailstore.model;

public class BillDetails {
	
	private User user;
	
	private double TotalAmount;
	
	private double netPayable;
	
	private PurchaseType purchaseType;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Double getTotalAmount() {
		return TotalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		TotalAmount = totalAmount;
	}

	public Double getNetPayable() {
		return netPayable;
	}

	public void setNetPayable(Double netPayable) {
		this.netPayable = netPayable;
	}

	public PurchaseType getPurchaseType() {
		return purchaseType;
	}

	public void setPurchaseType(PurchaseType purchaseType) {
		this.purchaseType = purchaseType;
	}

	public void setTotalAmount(double totalAmount) {
		TotalAmount = totalAmount;
	}

	public void setNetPayable(double netPayable) {
		this.netPayable = netPayable;
	}

}
