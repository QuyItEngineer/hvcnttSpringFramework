package day14;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.io.InputStream;
import java.util.Scanner;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import runningApplication.ApplicationRunningInterface;

public class MainAppDay14 implements ApplicationRunningInterface{

	public static void main(String[] args) {
		MainAppDay14 mainAppDay14 = new MainAppDay14();
		mainAppDay14.run();
	}

	@Override
	public void run() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans_day14_annotation_Inject.xml");
		System.out.println("-------- day 14: @Inject Annotation------");
		Payment paymentBean = (Payment)context.getBean("payment");
		int choose;
		do {
			printChoosePayment();
			Scanner scanner = new Scanner(System.in);
			choose = scanner.nextInt();
			chooseAndPrint(choose, paymentBean);
		} while (choose != 1 && choose !=2  && choose !=3);
	}

	public void printChoosePayment() {
		System.out.println(" ----- Choose----");
		System.out.println("1. Visa");
		System.out.println("2. Master");
		System.out.println("3. Exit");
	}
	public void chooseAndPrint(int choose, Payment paymentBean) {
		if (choose == 1) {
			System.out.println(paymentBean.getVisa().showTypeCard());
		}
		else if (choose == 2) {
			System.out.println(paymentBean.getMaster().showTypeCard());
		}
	}

}
