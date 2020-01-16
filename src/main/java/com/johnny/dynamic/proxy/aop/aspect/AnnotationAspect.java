package com.johnny.dynamic.proxy.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AnnotationAspect {

	@Around("@annotation(com.johnny.dynamic.proxy.aop.aspect.pointcut.PointCutAnnotation)")
	public Object invoke(ProceedingJoinPoint joinPoint) {

		try {
			System.out.println("AnnotationAspect =========before");
			Object response = joinPoint.proceed();
			System.out.println("AnnotationAspect =========after");
			return response;
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
		return null;
	}

}
