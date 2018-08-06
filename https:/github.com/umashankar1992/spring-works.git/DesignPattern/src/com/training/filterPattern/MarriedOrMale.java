package com.training.filterPattern;

import java.util.ArrayList;
import java.util.List;

public class MarriedOrMale implements ICriteria {
	public List<Person> meetCriteria(List<Person> person){
		List<Person> marriedOrMaleList=new ArrayList<Person>();
		for (Person temp : person) {
//			if (temp.getMaritalStatus().equals("married") || temp.getSex().equals("male")) {
//				marriedOrMaleList.add(temp);
//				
//				
//			}
			
		}
		
		return marriedOrMaleList;
	}

}
