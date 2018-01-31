package day9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import runningApplication.ApplicationRunningInterface;

public class MainAppDay9 implements ApplicationRunningInterface{

	public static void main(String[] args) {
		MainAppDay9 mainAppDay9 = new MainAppDay9();
		mainAppDay9.run();
	}

	@Override
	public void run() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans_day9_beanscope.xml");
		Customer customer1 = (Customer) context.getBean("customer");
		System.out.println("-------- day 9: Scope Bean ------");
		customer1.setMassage("Hello...");
		customer1.init();
		customer1.getMassage();
		customer1.destroy();
		System.out.println("   -------------");
		Customer customer2 = (Customer) context.getBean("customer");
		customer2.init();
		customer2.getMassage();
		customer2.destroy();
	}

}
