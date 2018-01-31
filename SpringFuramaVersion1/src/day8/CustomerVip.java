package day8;

public class CustomerVip {
	
	private boolean isVip;
	private boolean isDiscount;
	private boolean isValidPhoneNumber;
	
	
	public CustomerVip() {
	
	}
	public CustomerVip(boolean isVip, boolean isDiscount, boolean isValidPhoneNumber) {
		this.setisVip(isVip);
		this.setisDiscount(isDiscount);
		this.setisValidPhoneNumber(isValidPhoneNumber);
	}

	public boolean isVip() {
		return isVip;
	}

	public void setisVip(boolean isVip) {
		this.isVip = isVip;
	}

	public boolean getisDiscount() {
		return isDiscount;
	}

	public void setisDiscount(boolean isDiscount) {
		this.isDiscount = isDiscount;
	}

	public boolean getisValidPhoneNumber() {
		return isValidPhoneNumber;
	}

	public void setisValidPhoneNumber(boolean isValidPhoneNumber) {
		this.isValidPhoneNumber = isValidPhoneNumber;
	}

	public void printCustomer() {
		System.out.println("Customer is vip? : "+this.isVip()+".\n"
				+"Discount for bill? : "+this.getisDiscount()+".\n"
				+"ValidPhoneNumber is true?: "+this.getisValidPhoneNumber()+".");
	}
	
	@Override
	public String toString() {
		return "isVip: "+this.isVip()+".\n"
				+"isDiscount: "+this.getisDiscount()+".\n"
				+"isValidPhoneNumber: "+this.getisValidPhoneNumber()+".";
	}

}
