package com.mvn.ConstrutorInjection;

public class BeanClass {
 private int id;
 private String name;
 private String Course;
 private int batch;
 private String location;
 public BeanClass() {
	 
 }
 public BeanClass(int id,String name,String Course,int batch,String location) {
	 this.id=id;
	 this.name=name;
	 this.Course=Course;
	 this.batch=batch;
	 this.location=location;
 }
 public void setId(int id) {
	 this.id=id;
 }
 public void setName(String name) {
	 this.name=name;
 }
 public void setCourse(String Course) {
	 this.Course=Course;
 }
 public void setBatch(int batch) {
	 this.batch=batch;
 }
 public void setLocation(String location) {
	 this.location=location;
 }
 public int getId() {
	 return this.id;
 }
 public String getName() {
	 return this.name;
 }
 public String getCourse() {
	 return this.Course;
 }
 public int getBatch() {
	 return this.batch;
 }
 public String getLocation() {
	 return this.location;
 }
 public void print() {
	 System.out.println(this.name);
	 System.out.println(this.Course);
	 System.out.println(this.id);
	 System.out.println(this.batch);
	 System.out.println(this.location);
	 
 }
 
}
