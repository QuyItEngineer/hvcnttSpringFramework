package day2;


public class Customer {
	private String nameCustomer;
	private int ageCustomer;
	private String sexCustomer;
	private int idCustomer;
	public Customer() {
	}
	public Customer(String name, int age, String sex, int id) {
		this.setNameCustomer(name);
		this.setAgeCustomer(age);
		this.setSexCustomer(sex);
		this.setIdCustomer(id);
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
	
	public void printIntroCustomer() {
		System.out.println("--------- Intro Customer -----------\n"+
				"Name: "+this.nameCustomer+". Age: "+this.ageCustomer+". Sex: "+
				this.sexCustomer+". IdCustomer: "+this.idCustomer);
	}
}
