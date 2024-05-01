package com.mvn._collections_all;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.Map.Entry;

public class Employee {
	private List<String> empNames;
	private Set<Integer> empnum;
	private Map<String,Integer> empDept;
	private Properties empSal;
	public List<String> getEmpNames() {
		return empNames;
	}
	public void setEmpNames(List<String> empNames) {
		this.empNames = empNames;
	}
	public Set<Integer> getEmpnum() {
		return empnum;
	}
	public void setEmpnum(Set<Integer> empnum) {
		this.empnum = empnum;
	}
	public Map<String, Integer> getEmpDept() {
		return empDept;
	}
	public void setEmpDept(Map<String, Integer> empDept) {
		this.empDept = empDept;
	}
	public Properties getEmpSal() {
		return empSal;
	}
	public void setEmpSal(Properties empSal) {
		this.empSal = empSal;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(List<String> empNames,Set<Integer> empnum,Map<String,Integer> empDept,Properties empSal) {
	this.empNames=empNames;
	this.empnum=empnum;
	this.empDept=empDept;
	this.empSal=empSal;
	
	}
	public void print() {
		System.out.println(empNames);
		System.out.println(empnum);
		System.out.println(empDept);
		System.out.println(empSal);
	}

}
