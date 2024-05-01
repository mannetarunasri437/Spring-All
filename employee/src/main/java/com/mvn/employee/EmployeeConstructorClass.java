package com.mvn.employee;

public class EmployeeConstructorClass {
	int empId;
	String empname;
	String course;
	public EmployeeConstructorClass(int Id,String name,String course) {
		this.empId=Id;
		this.empname=name;
		this.course=course;
		
		
	}
	public void print() {
		System.out.println("emp id is "+empId);
		System.out.println("emp name is "+empname);
		System.out.println("emp course is "+course);
	}
	

}
