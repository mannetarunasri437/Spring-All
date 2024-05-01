package com.mvn.employee;

public class EmployeeclassMethos {
	int EmpId;
	String Empname;
	
	public void insert(int Id,String name) {
		EmpId=Id;
		Empname=name;
		
	}
	public void print() {
		System.out.println(EmpId);
		System.out.println(Empname);
	}
	
	

}
