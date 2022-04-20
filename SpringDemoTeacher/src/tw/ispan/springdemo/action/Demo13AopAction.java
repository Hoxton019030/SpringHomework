package tw.ispan.springdemo.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.ispan.springdemo.model.Teacher;

public class Demo13AopAction {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Teacher teacher = context.getBean("teacher1", Teacher.class);
		
		teacher.teach("授課");
		
		context.close();

	}

}
