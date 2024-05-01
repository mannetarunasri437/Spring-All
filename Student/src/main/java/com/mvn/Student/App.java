package com.mvn.Student;

import com.mvn.Student.interfacee.studentimpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*
    	Student s=new Student(37,"tharuna","java");
    	System.out.println(s.getRollno());
    	System.out.println(s.getName());
    	System.out.println(s.getCourse());
    	s.setName("tharu");
    	s.setRollno(35);
    	s.setCourse("python");
    	System.out.println(s.getName());
    	System.out.println(s.getRollno());
    	System.out.println(s.getCourse());*/
    	studentimpl s=new studentimpl(37,"tharuna","java");
    	System.out.println(s.getName());
    	System.out.println(s.getRollno());
    	System.out.println(s.getCourse());
    	
    }
}
