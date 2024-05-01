package com.mvn.DI_form_of_objects;

public class ProductBean {
	private int productId;
	private String productName;
	private int productPrice;
	private int productQuatity;
	public ProductBean() {
		
	}
	public ProductBean(int pid,String pname,int pprice,int pquatity) {
		this.productId=pid;
		this.productName=pname;
		this.productPrice=pprice;
		this.productQuatity=pquatity;
	}
	public void setproductId(int productId) {
		this.productId=productId;
		
	}
	public void setproductName(String productName) {
		this.productName=productName;
		
	}
	public void setproductPrice(int productPrice) {
		this.productPrice=productPrice;
		
	}
	public void setproductQuatity(int productQuatity) {
		this.productQuatity=productQuatity;
		
	}
	public int getproductId() {
		return this.productId;
	}
	public String getproductName() {
		return this.productName;
	}
	public int getProductPrice() {
		return this.productPrice;
	}
	public int getproductQuatity() {
		return this.productQuatity;
	}
	
	public  void print() {
		System.out.println(this.productId);
		System.out.println(this.productName);
		System.out.println(this.productPrice);
		System.out.println(this.productQuatity);
	}

}
