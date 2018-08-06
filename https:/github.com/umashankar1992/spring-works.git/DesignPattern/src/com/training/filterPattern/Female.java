package com.training.filterPattern;

import java.util.ArrayList;
import java.util.List;

public class Female implements ICriteria {
	
	public List<Person> meetCriteria(List<Person> persons){
		List<Person> femaleList=new ArrayList<Person>();
		for (Person temp : persons) {
			if (temp.getSex().equals("female")) {
				femaleList.add(temp);
				
			}
			
		}
		return femaleList;
	}

}
