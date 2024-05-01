package com.mvn._springApp_formOfObjects;

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
    	StudentBean stubean=(StudentBean) context.getBean("student");
    	stubean.print();
    }
}
