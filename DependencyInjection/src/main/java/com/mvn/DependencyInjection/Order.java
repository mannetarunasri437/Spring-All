package com.mvn.DependencyInjection;

public class Order {
	private int OrderId;
	private String oname;
	private Product product;
	public Order(int OrderId,String oname,Product product) {
		this.OrderId=OrderId;
		this.oname=oname;
		this.product=product;
	}
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product getProduct() {
		return this.product;
			
	}
	public void setProduct(Product product) {
		 this.product=product;
		
	}
	public void print() {
		System.out.println(this.OrderId);
		System.out.println(this.oname);
		System.out.println(this.product.getPId());
		System.out.println(this.product.getPname());
	}

}
