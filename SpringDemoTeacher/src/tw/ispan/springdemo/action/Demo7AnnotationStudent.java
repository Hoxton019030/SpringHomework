package tw.ispan.springdemo.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.ispan.springdemo.model.Student;

public class Demo7AnnotationStudent {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Student student1 = context.getBean("student", Student.class);

		student1.setId(1);
		student1.setName("Tim");
		student1.setNickName("Tim 哥");

		System.out.println(student1.getId() + " " + student1.getName() + " " + student1.getNickName());

		context.close();

	}

}
