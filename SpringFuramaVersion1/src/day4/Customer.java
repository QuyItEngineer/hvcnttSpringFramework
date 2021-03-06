package day4;

import org.springframework.beans.factory.annotation.Autowired;


public class Customer {
	private String nameCustomer;
	private int ageCustomer;
	private String sexCustomer;
	private int idCustomer;
	private Address address;
	private Booking booking;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(Address address) {
		this.address = address;
	}
	public Customer(String name, int age, String sex, int id, Address address) {
		this.setNameCustomer(name);
		this.setAgeCustomer(age);
		this.setSexCustomer(sex);
		this.setIdCustomer(id);
		this.address = address;
	}
	public String getNameCustomer() {
		return nameCustomer;
	}
	public void setNameCustomer(String nameCustomer) {
		this.nameCustomer = nameCustomer;
	}
	public int getAgeCustomer() {
		return ageCustomer;
	}
	public void setAgeCustomer(int ageCustomer) {
		this.ageCustomer = ageCustomer;
	}
	public String getSexCustomer() {
		return sexCustomer;
	}
	public void setSexCustomer(String sexCustomer) {
		this.sexCustomer = sexCustomer;
	}
	public int getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Booking getBooking() {
		return booking;
	}
	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	public void printIntroCustomer() {
		System.out.println("Intro Customer: \n"+
				"Name: "+this.nameCustomer+". Age: "+this.ageCustomer+". Sex: "+
				this.sexCustomer+". IdCustomer: "+this.idCustomer
				+"\n\tAddress Number: "+this.address.toString());
	}
	
}
