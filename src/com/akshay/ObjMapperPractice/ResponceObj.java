package com.akshay.ObjMapperPractice;

import java.util.ArrayList;
import java.util.List;

public class ResponceObj {
	
	private int statusCode;
	
	private List<CustomerObj> customers;

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public List<CustomerObj> getCustomers() {
		return customers;
	}

	public void setCustomers(List<CustomerObj> customers) {
		this.customers = customers;
	}
	
	public static ResponceObj createObj() {
		ResponceObj responceObj = new ResponceObj();
		responceObj.setStatusCode(200);
		List<CustomerObj> list = new ArrayList<CustomerObj>();
		list.add(new CustomerObj("1234", "akshay", "akshay@gmail.com"));
		list.add(new CustomerObj("3333", "rohit", "rohit@gmail.com"));
		responceObj.setCustomers(list);
		return responceObj;
	}

	@Override
	public String toString() {
		return "ResponceObjjj [statusCode=" + statusCode + ", customers=" + customers.toString() + "]";
	}
	
}
