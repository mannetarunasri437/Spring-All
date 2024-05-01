package com.mvn._javaBasedEx;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean("id1")
	public Employee getBean() {
		Address ad=new Address("hyderabad","telangana",50030);
		Employee bean=new Employee();
		bean.setId(1);
		bean.setName("tharuna");
		bean.setAddress(ad);
	
		return bean;
		
		
	}

}
