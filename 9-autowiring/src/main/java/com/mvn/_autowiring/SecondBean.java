package com.mvn._autowiring;

public class SecondBean {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
		System.out.println("this is setter");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public SecondBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SecondBean(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	
}
