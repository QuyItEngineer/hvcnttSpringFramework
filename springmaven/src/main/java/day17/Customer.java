package day17;

public class Customer {
	
	private String nameCustomer;
	private int ageCustomer;
	private String sexCustomer;
	private int idCustomer;
	
	public Customer() {
		// TODO Auto-generated constructor stub
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
	
	public int add(int a, int b) {
		System.out.println("quydeptrai");
		 return a + b;
	}
	
	@Override
	public String toString() {
		return "Intro Customer: "+this.getNameCustomer()+". "
				+this.getAgeCustomer()+". "+this.getSexCustomer()+". "
				+this.getIdCustomer()+".";
	}

}
