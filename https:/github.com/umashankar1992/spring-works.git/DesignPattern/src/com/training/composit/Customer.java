package com.training.composit;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private int sudtId;
	private String custName;
	private List<Customer> references;
	public Customer(){}
	
	
	public Customer(int sudtId, String custName) {
		super();
		this.sudtId = sudtId;
		this.custName = custName;
		this.references = references;
	}
	
	public int getSudtId() {
		return sudtId;
	}
	public void setSudtId(int sudtId) {
		this.sudtId = sudtId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	@Override
	public String toString() {
		return "Customer [sudtId=" + sudtId + ", custName=" + custName + "]";
	}
	
	public void addReferences(Customer customer){
		this.references.add(customer);
		
		
	}
	public void removeReferences(Customer customer){
		this.references.add(customer);
	}
	public List<Customer> getReferences(){
		return this.references;
	}
}


