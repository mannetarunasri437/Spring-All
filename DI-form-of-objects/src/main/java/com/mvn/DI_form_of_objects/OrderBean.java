package com.mvn.DI_form_of_objects;

public class OrderBean {
	private int ordeId;
	private ProductBean product;
	public  OrderBean() {
		
	}
	public OrderBean(int orderId,ProductBean product) {
		this.ordeId=orderId;
		this.product=product;
		
	}
	public void setOrderId(int orderid) {
		this.ordeId=orderid;
		
	}
	public int getOrderId(int orderid) {
		return this.ordeId;
	}
	public void setProduct(ProductBean product) {
		this.product=product;
	}
	public ProductBean getproduct() {
		return this.product;
		
	}
	public void print() {
		System.out.println(this.ordeId);
		System.out.println(this.product.getproductId());
		System.out.println(this.product.getproductName());
		System.out.println(this.product.getproductQuatity());
		System.out.println(this.product.getProductPrice());
	}
	

}
