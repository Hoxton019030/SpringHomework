package tw.ispan.springdemo.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.ispan.springdemo.model.Car;

public class Demo4CarAction {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Car car1 = context.getBean("car1", Car.class);
		
		System.out.println("car1 id: " + car1.getCarId());
		System.out.println("car1 Name: " + car1.getCarName());
		System.out.println("car1 Brand: " + car1.getBrand());
		
		
		Car car2 = context.getBean("car2", Car.class);
		System.out.println("car2 release date: " + car2.getReleaseDate());
		
		Car car3 = context.getBean("car3", Car.class);
		System.out.println("car3 id: " + car3.getCarId());
		System.out.println("car3 carName: " + car3.getCarName());
		System.out.println("car3 brand: " + car3.getBrand());
		System.out.println("car3 release date: " + car3.getReleaseDate());
		
		context.close();

	}

}
