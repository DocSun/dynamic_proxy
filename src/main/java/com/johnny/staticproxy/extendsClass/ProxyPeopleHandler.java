package com.johnny.staticproxy.extendsClass;

public class ProxyPeopleHandler extends PeopleHandler {

	private PeopleHandler peopleHandler;

	public ProxyPeopleHandler(PeopleHandler peopleHandler) {
		this.peopleHandler = peopleHandler;
	}

	@Override
	public void queryInfo() {
		System.out.println("before query people ==========");
		peopleHandler.queryInfo();
		System.out.println("after query people ============");
	}
}
