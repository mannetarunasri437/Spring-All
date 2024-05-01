package com.mvn._javaBasedEx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
    	Employee e=(Employee)context.getBean("id1");
    	e.Dispaly();
    	
    	
    	
    }
}
