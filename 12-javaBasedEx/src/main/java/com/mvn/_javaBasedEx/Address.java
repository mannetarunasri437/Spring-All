package com.mvn._javaBasedEx;

public class Address {
	private String city;
	private String state;
	private int pin;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String city, String state, int pin) {
		super();
		this.city = city;
		this.state = state;
		this.pin = pin;
	}
	public void Address() {
		// TODO Auto-generated method stub
		
	}
	

}