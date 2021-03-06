package day7;

import java.util.Iterator;
import java.util.List;

public class Resort {
	private String nameResort;
	private List<Customer> customer;
	public Resort() {
	
	}
	
	public String getNameResort() {
		return nameResort;
	}
	public void setNameResort(String nameResort) {
		this.nameResort = nameResort;
	}
	public List<Customer> getCustomer() {
		System.out.println(this.customer+" \n");
		return customer;
	}
	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}
	
	@Override
	public String toString() {
		Iterator<Customer> customerList = customer.iterator();
		String printCustomerInResort = null;
		while (customerList.hasNext()) {
			printCustomerInResort += customerList.next().toString()+". \n";
			
		}
		return printCustomerInResort;
	}

}
