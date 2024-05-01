package com.mvn._collection_set;

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
    	AmeerpetTech mybean=(AmeerpetTech)context.getBean("institute");
    	mybean.print();
    }
}
