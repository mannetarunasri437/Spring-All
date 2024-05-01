package com.mvn._spring_jdbc1;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeBean {
	private int empId;
	private String empName;
	private int DeptNo;
	private JdbcTemplate jt;
	public EmployeeBean(int empId, String empName, int deptNo, JdbcTemplate jt) {
		super();
		this.empId = empId;
		this.empName = empName;
		DeptNo = deptNo;
		this.jt = jt;
	}
	public EmployeeBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getDeptNo() {
		return DeptNo;
	}
	public void setDeptNo(int deptNo) {
		DeptNo = deptNo;
	}
	public JdbcTemplate getJt() {
		return jt;
	}
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	public void Create() {
		jt.execute("create table emp1(empId number,empName varchar(15),DeptNo number)");
		System.out.println("table created");
	}
	public void insert() {
		int ins=jt.update("insert into emp1 values(102,'tharuna',37)");
		System.out.println("values inserted");
	}
	public void updateRecord() {
		int up=jt.update("update emp1 set empName='tharu' where empId=101");
		System.out.println("updated");
	}
	public void delete() {
		int del=jt.update("delete  from emp1 where id=101");
	}
	public void getOneRecord() {
		List<Map<String,Object>>oneRecord=jt.queryForList("select * from emp1 where empId=101");
		Iterator it=oneRecord.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			System.out.println(obj.toString());
		}
	}
	public void getAllRecords() {
		List<Map<String,Object>>AllRecord=jt.queryForList("select * from emp1 ");
		Iterator it=AllRecord.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			System.out.println(obj.toString());
		}

	}
	

}
