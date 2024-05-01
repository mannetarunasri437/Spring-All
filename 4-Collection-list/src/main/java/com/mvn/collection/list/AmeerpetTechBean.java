package com.mvn.collection.list;

import java.util.List;

public class AmeerpetTechBean {
	private List<String> studentNames;

	public List<String> getStudentNames() {
		return studentNames;
	}

	public void setStudentNames(List<String> studentNames) {
		this.studentNames = studentNames;
	}

	public AmeerpetTechBean(List<String> studentNames) {
		super();
		this.studentNames = studentNames;
	}

	public AmeerpetTechBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void print() {
		System.out.println(studentNames);
	}

}
