package com.mvn.Has_A_relation;

public class Student {
	private String Studentname;
	private int sclass;
	private Marks marks;
	public Student(String Studentname,int sclass,Marks marks) {
		this.Studentname=Studentname;
		this.sclass=sclass;
		this.marks=marks;
		
	}
	public void setMarks(Marks marks) {
		this.marks=marks;
	}
	public Marks getMarks() {
		return this.marks;
	}

}
