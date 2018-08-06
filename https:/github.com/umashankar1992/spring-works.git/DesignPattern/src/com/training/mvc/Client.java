package com.training.mvc;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee model=new Employee(101,"Divya");
		StarView view=new StarView();
		EmplopyeeController controller=new EmplopyeeController(model,view);
		controller.updateView("star");

	}
	private static Employee retrive(){
		return new Employee(101,"Divya");
	}

}
