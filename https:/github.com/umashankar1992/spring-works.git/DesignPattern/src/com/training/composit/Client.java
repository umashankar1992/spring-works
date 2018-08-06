package com.training.composit;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer1=new Customer(101, "shan");
		Customer customer2=new Customer(101, "lohit");
		Customer customer3=new Customer(101, "ramana");
		Customer customer4=new Customer(101, "ashwani");
		Customer customer5=new Customer(101, "akshay");
		Customer customer6=new Customer(101, "ankit");
		Customer customer7=new Customer(101, "binod");
		Customer customer8=new Customer(101, "kavitha");
		Customer customer9=new Customer(101, "uma");
		customer1.addReferences( customer2);
		customer1.addReferences(customer3);
		customer1.addReferences(customer4);
		
		
		
		customer2.addReferences(customer5);
		customer2.addReferences(customer6);
		
		
		customer4.addReferences(customer7);
		customer4.addReferences(customer8);
		customer4.addReferences(customer9);
		System.out.println("Print all customer reference ");
		System.out.println("customer1's Reference "+customer1.getReferences());
		
for (Customer temp : customer2.getReferences()) {
	System.out.println(temp.getSudtId()+","+temp.getCustName());
	
}
	}

}
