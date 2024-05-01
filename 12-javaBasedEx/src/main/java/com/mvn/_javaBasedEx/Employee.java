package com.mvn._javaBasedEx;

public class Employee {
	private int id;
	private String name;
	private Address address;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public void Dispaly() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(address.getCity());
		System.out.println(address.getState());
		System.out.println(address.getPin());

		
	}

}
