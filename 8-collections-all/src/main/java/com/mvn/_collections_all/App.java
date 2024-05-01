package com.mvn._collections_all;

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
    	ApplicationContext context= new ClassPathXmlApplicationContext("springconfig.xml");
    	Employee mybean=(Employee)context.getBean("institute");
    	mybean.print();
    }
}
