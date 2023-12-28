package com.ilp.entity;

public class Service {

	private String serviceName;
	private String serviceCode;
	private double serviceRate;

	public Service(String serviceName, String serviceCode, double serviceRate) {
		this.serviceName = serviceName;
		this.serviceCode = serviceCode;
		this.serviceRate = serviceRate;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public double getServiceRate() {
		return serviceRate;
	}

	public void setServiceRate(double rate) {
		this.serviceRate = rate;
	}

}
