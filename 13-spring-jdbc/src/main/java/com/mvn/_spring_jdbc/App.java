package com.mvn._spring_jdbc;

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
    	BeanClass b=(BeanClass) context.getBean("jdbcId3");
    	/*b.create();
    	b.insert();
    	b.delete();
    	b.updateRecord();
    	b.insert();
    	b.getOneRecord();*/
    	b.insert();
    	b.getAllRecord();
    	
    }
}
