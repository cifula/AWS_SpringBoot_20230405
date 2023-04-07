package com.web.study.IocAndDi;

public class IocTest {
	
	private Test test;
	
	public IocTest(Test test) {
		this.test = test;
	}

	
	public void run() {
		test.printTest();
	}
}
