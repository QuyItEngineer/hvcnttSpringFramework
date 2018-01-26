package day3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import runningApplication.ApplicationRunningInterface;


public class MainAppDay3 implements ApplicationRunningInterface{

	public static void main(String[] args) {
		MainAppDay3 mainAppDay3 = new MainAppDay3();
		mainAppDay3.run();
	}

	@Override
	public void run() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans_day3.xml");
		Customer customer = (Customer)context.getBean("customer");
		System.out.println("------ day3: inject constructor ----------");
		customer.printIntroCustomer();
	}

}
