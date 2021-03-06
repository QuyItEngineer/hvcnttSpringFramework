package day5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import runningApplication.ApplicationRunningInterface;


public class MainAppDay5 implements ApplicationRunningInterface{

	public static void main(String[] args) {
		MainAppDay5 mainAppDay5 = new MainAppDay5();
		mainAppDay5.run();
	}

	@Override
	public void run() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans_day5_innerbean.xml");
		Payment payment = (Payment)context.getBean("payment");
		System.out.println("--------- Day 5: inner bean -------------");
		payment.printCustomerPayment();
		System.out.println("--------- All Bill -------");
		payment.printAllBillCustomerPayment();		
	}

}
