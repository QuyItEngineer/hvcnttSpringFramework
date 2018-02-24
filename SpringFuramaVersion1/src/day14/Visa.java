package day14;

import org.springframework.beans.factory.annotation.Autowired;
import javax.inject.Inject;

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
