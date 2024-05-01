package com.mvn._javabasedconfig;

public class BeanClass {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BeanClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BeanClass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void Dispaly() {
		System.out.println(id);
		System.out.println(name);
	}

}
