package com.mvn._secondApp;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathResource res=new ClassPathResource("SpringConfig.xml");
    	XmlBeanFactory factory=new XmlBeanFactory(res);
    	BeanClass mybean=(BeanClass) factory.getBean("mul");
    	mybean.printmul();
    
    }
}
