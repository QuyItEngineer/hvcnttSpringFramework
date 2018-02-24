package day12;

import org.springframework.beans.factory.annotation.Autowired;

public class Payment {
	private Visa visa;
	
	private Master master;
	
	public Payment() {
		// TODO Auto-generated constructor stub
	}
	
	public Payment(Visa visa, Master master) {
		this.setVisa(visa);
		this.setMaster(master);
	}
	
	public Visa getVisa() {
		return visa;
	}
	public void setVisa(Visa visa) {
		this.visa = visa;
	}
	public Master getMaster() {
		return master;
	}
	public void setMaster(Master master) {
		this.master = master;
	}
	
}
