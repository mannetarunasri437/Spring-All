package com.mvn.Has_A_relation;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Marks m=new Marks(98,87,45);
    	Student s=new Student("tharuna",10,m);
    	School s1=new School("NLSS",s);
    	s1.print();
    	
    }
}
