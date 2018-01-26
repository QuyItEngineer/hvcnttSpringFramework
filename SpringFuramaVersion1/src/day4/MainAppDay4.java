package day4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import runningApplication.ApplicationRunningInterface;


public class MainAppDay4 implements ApplicationRunningInterface{

	public static void main(String[] args) {
		MainAppDay4 mainAppDay4 = new MainAppDay4();
		mainAppDay4.run();
	}

	@Override
	public void run() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans_day4.xml");
		Customer customer = (Customer)context.getBean("customer");
		System.out.println("--------- Day 4: inject setter -------------");
		customer.getBooking().printCustomerBooking();	
	}
}
