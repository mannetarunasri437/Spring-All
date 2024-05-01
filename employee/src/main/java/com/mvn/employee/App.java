package com.mvn.employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*
    	EmployeeclassMethos e=new EmployeeclassMethos();
    	e.insert(101,"tharunasri");
    	e.print();*/
    	/*
    	EmployeeConstructorClass e=new EmployeeConstructorClass(108,"tharu","java");
    	e.print();*/
    	EmployeeSetter e=new EmployeeSetter();
    	e.setId(101);
    	e.setName("tharuna");
    	e.setCourse("java");
    	System.out.println(e.getId());
    	System.out.println(e.getName());
    	System.out.println(e.getCourse());
    	
    }
}
