package day15;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Payment {
	@Autowired(required = false)
	private Visa visa;
	@Autowired(required = false)
	private Master master;
	@Autowired(required = false)
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
