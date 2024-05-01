package com.mvn._annotationbased;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	private Model model;


	public Model getModel() {
		return model;
	}
    @Autowired
	public void setModel(Model model) {
		this.model = model;
		System.out.println("this is setter method");
	}

	public Car(Model model) {
		super();
		this.model = model;
		System.out.println("this constructor");

	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void carstarted(){
		if(model!=null) {
			model.carstart();
		}
		else {
			System.out.println("not started🚗");
		}
		
	}

}
