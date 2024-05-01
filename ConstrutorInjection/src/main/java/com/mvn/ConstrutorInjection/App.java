package com.mvn.ConstrutorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new ClassPathXmlApplicationContext("SpringConfig.xml");
    	BeanClass mybean=(BeanClass)context.getBean("std");
    	mybean.print();
    	
    	
    }
}

