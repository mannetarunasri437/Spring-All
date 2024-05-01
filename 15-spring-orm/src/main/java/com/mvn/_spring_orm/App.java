package com.mvn._spring_orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mvn._spring_orm.dao.studentDao;

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
    	studentDao student=(studentDao)context.getBean("stDao");
    	System.out.println(student.toString());
    	
    }
}
