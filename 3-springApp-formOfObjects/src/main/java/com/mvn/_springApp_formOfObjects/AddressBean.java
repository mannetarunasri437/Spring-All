package com.mvn._springApp_formOfObjects;

public class AddressBean {
	private String houseNum;
	private String city;
	private String state;
	private int pincode;
	public AddressBean() {
		
	}
	public AddressBean(String houseNum,String city,String state,int pincode) {
		this.houseNum=houseNum;
		this.city=city;
		this.state=state;
		this.pincode=pincode;
		
		
	}
	public void setHouseNum(String houseNum) {
		this.houseNum=houseNum;
	}
	public void setCity(String city) {
		this.city=city;
	}
	public void setState(String state) {
		this.state=state;
	}
	public void setPincode(int pincode) {
		this.pincode=pincode;
	}
	public String getHouseNum() {
		return this.houseNum;
	}
	public String getCity() {
		return this.city;
	}
	public String getState() {
		return this.state;
	}
	public int getPincode() {
		return this.pincode;
	}
	
	
	

}
