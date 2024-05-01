package com.mvn.DependencyInjection;

public class Product {
	private int pId;
	private String pname;
	
	public Product(int pId,String pname) {
		this.pId=pId;
		this.pname=pname;
		
	}
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setPId(int pId) {
		this.pId=pId;
	}
	public void setPname(String name) {
		this.pname=name;
	}
	public int getPId() {
		return this.pId;
	}
	public String getPname() {
		return this.pname;
	}

}
