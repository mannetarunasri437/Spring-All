package com.mvn._autowiring;

public class FirstBean {
	private SecondBean secondBean;
	
	public SecondBean getSecondBean() {
		return secondBean;
	}

	public void setSecondBean(SecondBean secondBean) {
		this.secondBean = secondBean;
	}

	public FirstBean(SecondBean secondBean) {
		this.secondBean=secondBean;
	}

	public FirstBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void print() {
		System.out.println("this a construtor");
		System.out.println(this.secondBean.getId());
		System.out.println(this.secondBean.getName());
	}

	
	

}
