package com.mvn.DI_form_of_objects;

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
    	ApplicationContext context= new ClassPathXmlApplicationContext("springconfigsetter.xml");
    	OrderBean order=(OrderBean)context.getBean("order");
    	order.print();
    }
}
