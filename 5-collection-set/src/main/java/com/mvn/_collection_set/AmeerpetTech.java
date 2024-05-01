package com.mvn._collection_set;

import java.util.Set;

public class AmeerpetTech {
	private Set<Integer> studentRoll;
	public void setStudentRoll(Set<Integer> studentRoll) {
		this.studentRoll=studentRoll;
	}
	public Set<Integer> getStudentRoll(){
		return this.studentRoll;
		
	}
	
	public AmeerpetTech() {
		
	}
	public AmeerpetTech(Set<Integer> studentRoll) {
		this.studentRoll=studentRoll;
		
	}
	public void print() {
		System.out.println(studentRoll);
	}

}
