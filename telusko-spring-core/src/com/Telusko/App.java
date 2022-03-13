package com.Telusko;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("myspring.xml");
//		Vehicle c = (Vehicle) context.getBean("bike");
//		c.drive();
		
		
		/*Tyre t = (Tyre) context.getBean("tyre");
		Tyre t1 = (Tyre) context.getBean("tyre1");
		Tyre tUsingConstructor = (Tyre) context.getBean("tyreC");
		System.out.println("t1 using setter: " + t );
		System.out.println("t2 using setter: " + t1 );
		System.out.println("Using Constructor: " + tUsingConstructor);
		*/
		//below is using Autowired
		Car obj = (Car) context.getBean("car");
		obj.drive();
	}

}
