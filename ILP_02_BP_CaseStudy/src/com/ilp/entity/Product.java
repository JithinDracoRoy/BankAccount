package com.ilp.entity;

import java.util.ArrayList;

import com.ilp.interfaces.CashTransfer;

public abstract class Product implements CashTransfer {
	
	private String productCode;
	private String productName;
	private ArrayList<Service> serviceList=null;
	
	public Product(String productCode, String productName, ArrayList<Service> serviceList) {
		this.productCode = productCode;
		this.productName = productName;
		this.serviceList = serviceList;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public ArrayList<Service> getServiceList() {
		return serviceList;
	}

	public void setServiceList(ArrayList<Service> serviceList) {
		this.serviceList = serviceList;
	}

}
