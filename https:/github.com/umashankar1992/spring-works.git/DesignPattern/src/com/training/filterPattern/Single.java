package com.training.filterPattern;

import java.util.ArrayList;
import java.util.List;

public class Single implements ICriteria{
	
	public List<Person> meetCriteria(List<Person>persons){
		List<Person>singleList=new ArrayList<Person>();
		for (Person temp : persons) {
			if(temp.getMaritalStatus().equals("single")){
				//System.out.println(singleList);
				singleList.add(temp);
			}
		}
		return  singleList;

	}

}
