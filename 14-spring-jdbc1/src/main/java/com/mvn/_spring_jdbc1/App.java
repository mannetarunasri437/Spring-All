package com.mvn._spring_jdbc1;

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
    	@SuppressWarnings("resource")
    	ApplicationContext context=new ClassPathXmlApplicationContext("springConfig.xml");
    	EmployeeBean b=(EmployeeBean)context.getBean("empBean");
    	//b.Create();
    	//b.insert();
    	//b.getOneRecord();
    	//b.insert();
    	//b.updateRecord();
    	b.getAllRecords();

    }
}
