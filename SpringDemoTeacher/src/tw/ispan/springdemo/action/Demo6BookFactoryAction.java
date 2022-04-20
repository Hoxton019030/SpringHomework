package tw.ispan.springdemo.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.ispan.springdemo.model.Book;

public class Demo6BookFactoryAction {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Book book3 = context.getBean("marketBook", Book.class);
		System.out.println("id: " + book3.getBookId() + ", bookname: " + book3.getBookName());
		
		Book book4 = context.getBean("tcpBook", Book.class);
		System.out.println("id: " + book4.getBookId() + ", bookname: " + book4.getBookName());
		
		context.close();

	}

}
