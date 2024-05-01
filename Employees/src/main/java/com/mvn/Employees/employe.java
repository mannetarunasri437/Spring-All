package com.mvn.Employees;

public class employe {
	private String name;
	private int age;
	private double salary;
	public employe(String name,int age,double salary) {
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setage(int age) {
		this.age=age;
	}
	public void setsalary(double salary) {
		this.salary=salary;
	}
	public String getname() {
		return this.name;
	}
	public int getage() {
		return this.age;
	}
	public double getsalary() {
		return this.salary;
	}
	

}
