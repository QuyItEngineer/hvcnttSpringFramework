package day9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
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
		System.out.println("-------- day 9: Scope Bean ------");
		Customer customer1 = (Customer) context.getBean("customer");
		customer1.setMassage("Mr. Quy created.");
		customer1.getMassage();
		System.out.println("   -------------");
		Customer customer2 = (Customer) context.getBean("customer");
		customer2.getMassage();
		((AbstractApplicationContext) context).close();
	}

}
