package com.mvn.employee;

public class EmployeeSetter {
	int empid;
	String empname;
	String course;
	public void setId(int id) {
		this.empid=id;
	}
	public int getId() {
		return this.empid;
		
	}
	public void setName(String name) {
		this.empname=name;
	}
	public String getName() {
		return this.empname;
	}
	public void setCourse(String course) {
		this.course=course;
	}
	public String getCourse() {
		return this.course;
	}
	

}
