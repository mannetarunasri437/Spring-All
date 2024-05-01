package com.mvn.Employees;

import com.mvn.Employees.interfacee.Employeeimp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*
    	employe e=new employe("tharuna",23,5000);
    	e.setname("tharu");
    	e.setage(24);
    	e.setsalary(6000);
    	System.out.println(e.getname());
    	System.out.println(e.getage());
    	System.out.println(e.getsalary());*/
    	
    	Employeeimp e=new Employeeimp("tharuna",23,5000);
    	e.setname("tharuna");
    	e.setage(23);
    	e.setsalary(6000);
    	System.out.println(e.getname());
    	System.out.println(e.getage());
    	System.out.println(e.getsalary());
    	
    	
    	
    	
    	
    }
}
