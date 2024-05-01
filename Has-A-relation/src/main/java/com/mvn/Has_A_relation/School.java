package com.mvn.Has_A_relation;

public class School {
	private  String SchoolName;
	private Student student;
	public School(String Schoolname,Student student) {
		this.SchoolName=Schoolname;
		this.student=student;	
	}
	public void setStudent(Student student) {
		this.student=student;
	}
	public Student getStudent() {
		return this.student;
	}
	public void print() {
		System.out.println(this.SchoolName);
		System.out.println(this.student.getMarks());
		
	}
	
	
	

}
