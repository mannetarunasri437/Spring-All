package com.mvn.Student;

public class Student {
	private int rollno;
	private String name;
	private String course;
	public Student(int rollno,String name,String course) {
		this.rollno=rollno;
		this.name=name;
		this.course=course;
	}
	public void setRollno(int rollno) {
		this.rollno=rollno;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setCourse(String course) {
		this.course=course;
	}
	public int getRollno() {
		return this.rollno;
	}
	public String getName() {
		return this.name;
	}
	public String getCourse() {
		return this.course;
	}

}
