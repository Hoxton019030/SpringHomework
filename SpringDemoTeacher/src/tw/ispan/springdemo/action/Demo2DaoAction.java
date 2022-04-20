package tw.ispan.springdemo.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.ispan.springdemo.model.LoginDao;

public class Demo2DaoAction {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		LoginDao dao = context.getBean("loginDao", LoginDao.class);

		boolean result = dao.checkLogin("jerry", "pwddd");
		
		System.out.println("result: " + result);
		
		context.close();
	}

}
