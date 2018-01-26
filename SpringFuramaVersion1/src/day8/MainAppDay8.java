package day8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import runningApplication.ApplicationRunningInterface;

public class MainAppDay8 implements ApplicationRunningInterface{

	public static void main(String[] args) {
		MainAppDay8 mainAppDay8 = new MainAppDay8();
		mainAppDay8.run();
	}

	@Override
	public void run() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans_day8_spel.xml");
		Resort resort = (Resort) context.getBean("resortList");
		System.out.println("-------- day 8: Spring Expression SpEL ------");
		resort.printCustomer();
	}

}