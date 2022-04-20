package tw.ispan.springdemo.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.ispan.springdemo.model.LightBean;

public class Demo10PropertiesFileAction {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		LightBean lightBean = context.getBean("light", LightBean.class);
		
		System.out.println("light id: " + lightBean.getId());
		System.out.println("light red time: " + lightBean.getRed());
		System.out.println("light green time: " + lightBean.getGreen());
		System.out.println("light yellow: " + lightBean.getYellow());
		
		context.close();
	}

}
