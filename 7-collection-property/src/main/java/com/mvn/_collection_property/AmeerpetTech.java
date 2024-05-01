package com.mvn._collection_property;

import java.util.Properties;
import java.util.Set;

public class AmeerpetTech {
	private Properties studentbatches;

	public Properties getStudentbatches() {
		return studentbatches;
	}

	public void setStudentbatches(Properties studentbatches) {
		this.studentbatches = studentbatches;
	}

	public AmeerpetTech() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AmeerpetTech(Properties studentbatches) {
		this.studentbatches=studentbatches;
	}
	public void print() {
		Set<String>keys=studentbatches.stringPropertyNames();
		for(String key:keys) {
			System.out.println(key+":"+studentbatches.getProperty(key));
		}
		
	}
	
	

}
