package day6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import runningApplication.ApplicationRunningInterface;


public class MainAppDay6 implements ApplicationRunningInterface{

	public static void main(String[] args) {
		MainAppDay6 mainAppDay6 = new MainAppDay6();
		mainAppDay6.run();
	}

	@Override
	public void run() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans_day6_p_namespace.xml");
		SwimmingPool swimmingPool = (SwimmingPool)context.getBean("swimming");
		System.out.println("--------- Day 6: P -------------");
		swimmingPool.printSwimmingPool();
	}

}
