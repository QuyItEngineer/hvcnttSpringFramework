package day17;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.TestCase;


/**
 * Hello world!
 *
 */
public class AppTest
{
	private Customer customer;
	
	@Test
    public void TestInfomationCustomer() {
		customer = new Customer();
		customer.setNameCustomer("Alex");
		customer.setIdCustomer(20);
		customer.setSexCustomer("Nam");
		customer.setIdCustomer(123456789);
		System.out.println("Infomation Customer");
		System.out.println(customer.toString());
		assertEquals("Alex", customer.getNameCustomer());
		
    }
}
