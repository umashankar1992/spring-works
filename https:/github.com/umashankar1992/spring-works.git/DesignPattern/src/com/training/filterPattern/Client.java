package com.training.filterPattern;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> list=new ArrayList<Person>();
		list.add(new Person("lohit","male","single"));
		list.add(new Person("rohit","male","single"));
		list.add(new Person("sobha","female","married"));
		list.add(new Person("monika","female","single"));
		list.add(new Person("subohit","male","married"));
		list.add(new Person("rekha","female","single"));
		
ICriteria maleCriteria=new Male();
System.out.println("-------Only Male---------");
maleCriteria.meetCriteria(list).forEach(System.out::println);
ICriteria femaleCriteria=new Female();
System.out.println("-----------only female----------");
femaleCriteria.meetCriteria(list).forEach(System.out::println);
ICriteria singleCriteria=new Single();
System.out.println("--------Only single-----------");
singleCriteria.meetCriteria(list).forEach(System.out::println);
ICriteria maleOrMarriedCriteria=new  MarriedOrMale();
System.out.println("--------Only Male Or Married-----------");
maleOrMarriedCriteria.meetCriteria(list).forEach(System.out::println);
	}

}
