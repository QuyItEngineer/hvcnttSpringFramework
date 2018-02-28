package day16;

public class Customer {
	
	private String nameCustomer;
	private int ageCustomer;
	private String sexCustomer;
	private int idCustomer;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(String nameCustomer, int ageCustomer, String sexCustomer, int idCustomer) {
		this.nameCustomer = nameCustomer;
		this.ageCustomer = ageCustomer;
		this.sexCustomer = sexCustomer;
		this.idCustomer = idCustomer;
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
	
	@Override
	public String toString() {
		return "Intro Customer: "+this.getNameCustomer()+". "
				+this.getAgeCustomer()+". "+this.getSexCustomer()+". "
				+this.getIdCustomer()+".";
	}

}
