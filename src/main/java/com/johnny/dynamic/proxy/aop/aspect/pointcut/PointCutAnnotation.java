package com.johnny.dynamic.proxy.aop.aspect.pointcut;


import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface PointCutAnnotation {

	String name();
}
