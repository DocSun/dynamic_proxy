package com.johnny.dynamic.proxy.aop;

import com.johnny.dynamic.proxy.aop.aspect.pointcut.PointCutAnnotation;
import org.springframework.stereotype.Component;

@Component
public class ProxiedClass {

	@PointCutAnnotation(name = "test")
	public void testMethod(){
		System.out.println("testMethod=====");
	}


	public void test2() {
		System.out.println("test2 =============");
}
}
