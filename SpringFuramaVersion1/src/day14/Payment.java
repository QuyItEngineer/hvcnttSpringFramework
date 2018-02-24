package day14;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;

public class Payment {
	@Inject
	private Visa visa;
	@Inject
	private Master master;
	@Inject
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
