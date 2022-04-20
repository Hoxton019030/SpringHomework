package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotation {
	public static void main(String[] args) {
		ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
		AnnotationUser au = appCon.getBean("annotationUser",AnnotationUser.class);
		System.out.println(au.getUname());
	}

}
