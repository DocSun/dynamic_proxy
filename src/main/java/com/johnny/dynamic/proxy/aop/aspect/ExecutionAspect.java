package com.johnny.dynamic.proxy.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ExecutionAspect {

	@Around("execution(* com.johnny.dynamic.proxy.aop.ProxiedClass.testMethod(..))")
	public Object invoke(ProceedingJoinPoint joinPoint) {
		try {
			System.out.println("ExecutionAspect ============= before");
			Object response = joinPoint.proceed();
			System.out.println("ExecutionAspect ============ after");
			return response;
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
		return null;
	}
}
