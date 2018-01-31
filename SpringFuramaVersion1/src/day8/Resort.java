package day8;

import java.util.Iterator;
import java.util.List;


public class Resort {
	private String nameResort;
	private String nameCustomer;
	private List<CustomerVip> customer;
	
	public Resort() {
	}

	public String getNameResort() {
		return nameResort;
	}

	public void setNameResort(String nameResort) {
		this.nameResort = nameResort;
	}

	public String getNameCustomer() {
		return nameCustomer;
	}

	public void setNameCustomer(String nameCustomer) {
		this.nameCustomer = nameCustomer;
	}
	
	public List<CustomerVip> getCustomer() {
		return customer;
	}

	public void setCustomer(List<CustomerVip> customer) {
		this.customer = customer;
	}

	public void printCustomer() {
		System.out.println(this.customer.toString());
	}
	@Override
	public String toString() {
		Iterator<CustomerVip> customerList = customer.iterator();
		String printCustomerInResort = null;
		while (customerList.hasNext()) {
			printCustomerInResort += customerList.next().toString()+". \n";	
		}
		return printCustomerInResort;
	}

}
