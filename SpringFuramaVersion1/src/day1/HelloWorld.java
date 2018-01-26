package day1;

public class HelloWorld {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void printHello() {
		System.out.println("Your Message : " + message);
	}
}
