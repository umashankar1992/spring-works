package com.training.mvc;

public class EmplopyeeController {
	private Employee model;
	private StarView starView;
	
	public EmplopyeeController() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmplopyeeController(Employee model, StarView starView) {
		super();
		this.model = model;
		this.starView = starView;
	}
	public Employee getModel() {
		return model;
	}
	public void setModel(Employee model) {
		this.model = model;
	}
	public StarView getStarView() {
		return starView;
	}
	public void setStarView(StarView starView) {
		this.starView = starView;
	}
	@Override
	public String toString() {
		return "EmplopyeeController [model=" + model + ", starView=" + starView + "]";
	}
	public void updateView(String viewType){
		System.out.println("showing"+viewType+"view");
		starView.printEmployee(model);
		
	}

}
