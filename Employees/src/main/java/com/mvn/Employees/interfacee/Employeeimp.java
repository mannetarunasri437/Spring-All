package com.mvn.Employees.interfacee;

public class Employeeimp implements EmployeeInterface {
	String name;
	int age;
	double salary;
	public Employeeimp(String name,int age,double salary) {
		this.name=name;
		this.age=age;
		this.salary=salary;
	}

	@Override
	public void setname(String name) {
		// TODO Auto-generated method stub
		this.name=name;

	}

	@Override
	public void setage(int age) {
		this.age=age;

	}

	@Override
	public void setsalary(double salary) {
		// TODO Auto-generated method stub
		this.salary=salary;

	}

	@Override
	public String getname() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public int getage() {
		// TODO Auto-generated method stub
		return this.age;
	}

	@Override
	public double getsalary() {
		// TODO Auto-generated method stub
		return this.salary;
	}

}
