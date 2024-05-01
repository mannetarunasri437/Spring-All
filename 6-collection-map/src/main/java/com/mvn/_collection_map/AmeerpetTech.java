package com.mvn._collection_map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AmeerpetTech {
	private Map<String,String> studentCourses;
	public void setStudentCourses(Map<String,String> studentCourses) {
		this.studentCourses=studentCourses;
	}
	public Map<String,String> getStudentCourses(){
		return this.studentCourses;
	}
	public AmeerpetTech() {
		
	}
	public AmeerpetTech(Map<String,String> studentCourses) {
		this.studentCourses=studentCourses;
	}
	/*
	public void print() {
		System.out.println(studentCourses);
	}*/
	public void print() {
		for(Entry<String, String> entry:studentCourses.entrySet()){
			System.out.println(((Entry<String, String>) entry).getKey()+":"+entry.getValue());
			
			
		}
	}

}
