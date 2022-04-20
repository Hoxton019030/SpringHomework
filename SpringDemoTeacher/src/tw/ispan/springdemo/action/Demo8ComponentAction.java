package tw.ispan.springdemo.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.ispan.springdemo.model.CreditCard;

public class Demo8ComponentAction {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//		CreditCard card = (CreditCard) context.getBean("creditCardGoGo");
		CreditCard card = (CreditCard) context.getBean("creditCardHappy");
		
		card.useCard("購物");
		
		context.close();
	}

}
