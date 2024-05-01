package com.mvn.product;

public class student {
	int sid;
	String sname;
	String scourse;
	String sdoj;
	int sbatch;
	public void insert(int id,String name,String course,String doj,int batch) {
		sid=id;
		sname=name;
		scourse=course;
		sdoj=doj;
		sbatch=batch;
	}
	public void print() {
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(scourse);
		System.out.println(sdoj);
		System.out.println(sbatch);
	}

}
