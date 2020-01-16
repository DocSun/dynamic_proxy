package com.johnny.staticproxy.interfaceImpl;

public class StudentServiceImpl implements StudentService {

	@Override
	public void queryStudent() {
		System.out.println("query student");
	}
}
