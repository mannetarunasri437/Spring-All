package com.mvn._spring_jdbc;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class BeanClass {
	private JdbcTemplate jt;

	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public BeanClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BeanClass(JdbcTemplate jt) {
		super();
		this.jt = jt;
	}
	
	public void create() {
		jt.execute("create table m_student(id number,name varchar(20),course varchar(10))");
		 		System.out.println("table created");

		
		
	}
	public void insert() {
        int insert=jt.update("insert into m_student values(102,'tharuna','java')");
		
		System.out.println("values inserted");
		
	}
	public void delete() {
	int insert= jt.update("delete from m_student where id='101'");
	System.out.println("deleted");
	}
	public void updateRecord() {
		int up=jt.update("update m_student set name='tharuna' where id=101");
		System.out.println(up+"updated");
	}
	public void getOneRecord() {
		List<Map<String,Object>>oneRecord=jt.queryForList("select * from m_student where id=101");
		Iterator it=oneRecord.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			System.out.println(obj.toString());
		}
		
		
		
	}
	public void getAllRecord() {
		List<Map<String,Object>>AllRecord=jt.queryForList("select * from m_student ");
		Iterator it=AllRecord.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			System.out.println(obj.toString());
		}

	
  
	}
}
