package day17;

import day16.ApplicationRunningInterface;
import day16.Customer;

/**
 * Hello world!
 *
 */
public class App implements ApplicationRunningInterface
{
    public static void main( String[] args )
    {
        App app =  new App();
        app.run();
    }
    
    public static void showInformationCustomer() {
    	Customer customer = new Customer("Vo Quang Tuan",22,"Gay",123456789);
    	System.out.println(customer.toString());
    }

	public void run() {
		showInformationCustomer();
		
	}
}
