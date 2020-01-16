package com.johnny.staticproxy;

import com.johnny.staticproxy.extendsClass.PeopleHandler;
import com.johnny.staticproxy.extendsClass.ProxyPeopleHandler;
import com.johnny.staticproxy.extendsClass.StudentHandler;
import com.johnny.staticproxy.interfaceImpl.ProxyStudentSerivce;
import com.johnny.staticproxy.interfaceImpl.StudentService;
import com.johnny.staticproxy.interfaceImpl.StudentServiceImpl;

public class StaticProxyMain {

	public static void main(String[] args) {

		//使用接口进行静态代理
		StudentService studentService = new ProxyStudentSerivce(new StudentServiceImpl());
		studentService.queryStudent();

		//使用继承类的方式进行静态代理
		PeopleHandler peopleHandler = new ProxyPeopleHandler(new StudentHandler());
		peopleHandler.queryInfo();
	}
}
