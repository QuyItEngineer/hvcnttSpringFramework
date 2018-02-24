package day13;

import org.springframework.beans.factory.annotation.Autowired;

public class Visa implements Card{
	
	public Visa() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String showTypeCard() {
		// TODO Auto-generated method stub
		return "It's payment by Visa";
	}
	
}
