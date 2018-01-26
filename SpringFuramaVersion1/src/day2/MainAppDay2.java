package day2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import runningApplication.ApplicationRunningInterface;


public class MainAppDay2 implements ApplicationRunningInterface{

	public static void main(String[] args) {
		MainAppDay2 mainAppDay2 = new MainAppDay2();
		mainAppDay2.run();
	}

	@Override
	public void run() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans_day2.xml");
		Customer customer = (Customer)context.getBean("customer");
        System.out.println("--------- day 2: Hello World --------");
        customer.printIntroCustomer();
	}

}
