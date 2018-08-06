package com.training.filterPattern;

import java.util.List;

public interface ICriteria {
	public List<Person> meetCriteria(List<Person>person);
	//public List<Person> singleCriteria(List<Person>persons);

}
