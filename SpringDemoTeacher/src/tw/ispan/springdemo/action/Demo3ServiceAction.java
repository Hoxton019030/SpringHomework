package tw.ispan.springdemo.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.ispan.springdemo.model.LoginService;

public class Demo3ServiceAction {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		LoginService service = context.getBean("loginService", LoginService.class);
		
		boolean result = service.checkLogin("jerry", "pwddd");
		
		System.out.println("result: " + result);
		
		LoginService service2 = context.getBean("loginService2", LoginService.class);
		boolean result2 = service2.checkLogin("jerry", "pwddd");
		
		System.out.println("result2: " + result2);
		
		context.close();
	}

}
