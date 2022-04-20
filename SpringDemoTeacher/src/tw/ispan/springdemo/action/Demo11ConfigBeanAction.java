package tw.ispan.springdemo.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.ispan.springdemo.model.Phone;

public class Demo11ConfigBeanAction {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Phone phone = context.getBean("myPhone", Phone.class);
		
		System.out.println("phone id: " + phone.getId());
		System.out.println("phone Name: " + phone.getPhoneName());
		System.out.println("phone Brand: " + phone.getPhoneBrand());
	    
		context.close();

	}

}
