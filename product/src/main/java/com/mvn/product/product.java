package com.mvn.product;

public class product {
	int pid;
	String pname;
	String pquantity;
	double pprice;
	public void insert(int id,String quantity,double price) {
		 pid=id;
		pquantity=quantity;
		pprice=price;
		
		
	}
	public void print() {
		System.out.println(pid);
		System.out.println(pquantity);
		System.out.println(pprice);
		
	}

}
