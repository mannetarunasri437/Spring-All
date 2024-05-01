package com.mvn.collection.list;

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
    	AmeerpetTechBean mybean=(AmeerpetTechBean)context.getBean("institute");
    	mybean.print();
    }
}
