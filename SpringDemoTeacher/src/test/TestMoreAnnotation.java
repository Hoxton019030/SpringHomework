package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import annotation.controller.TestController;

public class TestMoreAnnotation {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
		TestController testcon = appCon.getBean("testController",TestController.class);
		testcon.save();
	}

}
