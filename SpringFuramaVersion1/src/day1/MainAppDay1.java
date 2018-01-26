package day1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import runningApplication.ApplicationRunningInterface;

public class MainAppDay1 implements ApplicationRunningInterface{

	public static void main(String[] args) {
		MainAppDay1 mainAppDay1 = new MainAppDay1();
		mainAppDay1.run();
	}

	@Override
	public void run() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans_day1.xml");
		HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
        HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
        System.out.println(" ---- day 1: Hello World --------");
        objB.printHello();
        objA.setMessage("I'm object A");
        objA.printHello();
	}

}
