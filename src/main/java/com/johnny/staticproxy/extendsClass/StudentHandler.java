package com.johnny.staticproxy.extendsClass;

import com.johnny.staticproxy.extendsClass.PeopleHandler;

public class StudentHandler extends PeopleHandler {

	@Override
	public void queryInfo() {
		System.out.println("Query student info =======");
	}
}
