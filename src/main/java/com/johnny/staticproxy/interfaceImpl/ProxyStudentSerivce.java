package com.johnny.staticproxy.interfaceImpl;

public class ProxyStudentSerivce implements StudentService {

	StudentService studentService;

	public ProxyStudentSerivce (StudentService studentService) {
		this.studentService = studentService;
	}

	@Override
	public void queryStudent() {
		System.out.println("queryStudent before ==========");
		studentService.queryStudent();
		System.out.println("queryStudent after ===========");
	}
}
