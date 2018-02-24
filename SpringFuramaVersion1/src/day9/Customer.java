package day9;

public class Customer {
	private String massage;
	
	
	public String getMassage() {
		System.out.println("Result: "+massage);
		return massage;
	}

	public void setMassage(String massage) {
		this.massage = massage;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public void init() {
		System.out.println("begin...");
	}
	
	public void destroy() {
		System.out.println("Bean destroying.");
	}
}
