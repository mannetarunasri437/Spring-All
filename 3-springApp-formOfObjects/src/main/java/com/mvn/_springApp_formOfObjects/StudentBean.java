package com.mvn._springApp_formOfObjects;

public class StudentBean {
    private int studentId;
	private String sname;
	private AddressBean addressbean;
	public StudentBean() {
		
	}
	public StudentBean(int sId,String sname,AddressBean addressbean) {
        this.studentId=sId;
		this.sname=sname;
		this.addressbean=addressbean;
	}
	public void setSname(String sname) {
		this.sname=sname;
	}
	public void setStudentid(int sId) {
		this.studentId=sId;
	}
	public void setAddressBean(AddressBean addressbean) {
		this.addressbean=addressbean;
	}
	public String getSname() {
		return this.sname;
	}
	public int getStudentid() {
		return this.studentId;
	}
	public AddressBean getAddressBean() {
		return this.addressbean;
	}
	public void print() {
		System.out.println(this.studentId);
		System.out.println(this.sname);
		System.out.println(this.addressbean.getHouseNum());
		System.out.println(this.addressbean.getCity());
		System.out.println(this.addressbean.getState());
		System.out.println(this.addressbean.getPincode());



		
	}
	

}
