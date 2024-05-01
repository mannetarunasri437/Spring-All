package com.mvn.Student.interfacee;

public class studentimpl implements StudentInterface {
	private int rollno;
	private String name;
	private String course;
	public studentimpl(int rollno,String name,String course) {
		this.rollno=rollno;
		this.name=name;
		this.course=course;
	}

	@Override
	public void setRollno(int rollno) {
		// TODO Auto-generated method stub
		this.rollno=rollno;

	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;

	}

	@Override
	public void setCourse(String course) {
		// TODO Auto-generated method stub
		this.course=course;

	}

	@Override
	public int getRollno() {
		// TODO Auto-generated method stub
		return this.rollno;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public String getCourse() {
		// TODO Auto-generated method stub
		return this.course;
	}

}
