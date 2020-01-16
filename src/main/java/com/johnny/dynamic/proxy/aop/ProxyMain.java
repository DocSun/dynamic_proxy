package com.johnny.dynamic.proxy.aop;

import com.johnny.dynamic.proxy.aop.ProxiedClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProxyMain {
	public static void main(String[] args) {


		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

		ProxiedClass proxidClass = context.getBean("proxiedClass", ProxiedClass.class);
		proxidClass.testMethod();

	}
}
