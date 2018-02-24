package day15;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class Master implements Card{

	public Master() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String showTypeCard() {
		// TODO Auto-generated method stub
		return "It's payment by Master";
	}

}
