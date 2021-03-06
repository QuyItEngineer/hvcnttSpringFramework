package day7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import runningApplication.ApplicationRunningInterface;

public class MainAppDay7 implements ApplicationRunningInterface{

	public static void main(String[] args) {
		MainAppDay7 mainAppDay7 = new MainAppDay7();
		mainAppDay7.run();
	}

	@Override
	public void run() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans_day7_list.xml");
		Resort resort = (Resort) context.getBean("resort");
		System.out.println("---------- day 7: Wiring collection ------------");
		resort.getCustomer();
		Customer  customer = (Customer) context.getBean("customer01");
		customer.printCustomer();
	}

}
