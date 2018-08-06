package com.training.singleton;
// this program to show working of lazy singleton

class Company{
	private Company(){
		System.out.println("constructor called...");
	}
	public static Company getInstance(Company company){
		if (company==null) {
			return new Company();
		}
		return company;
	}
}
class Emp{
	int empId;
	String empName;
	Company company;
}

public class SingletonClient02 {
	public static void main(String[] args) {
		//Company company=new Company();
		// you can not create an instance of variable
		Company company=null;
		company=Company.getInstance(company);
		Emp emp1=new Emp();
		emp1.empId=101;
		emp1.empName="Shan";
		emp1.company=company;
		System.out.println(company.hashCode());
		Emp emp2=new Emp();
		emp2.empId=102;
		emp2.empName="David";
		emp2.company=company;
		System.out.println(company.hashCode());
	}

}
