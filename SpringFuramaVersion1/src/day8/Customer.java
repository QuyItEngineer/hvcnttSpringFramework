package day8;

public class Customer {
	private String nameCustomer;
	private int  moneyOfCustomer;
	private String addressCustomer;
	private boolean vip;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public String getNameCustomer() {
		return nameCustomer;
	}
	public void setNameCustomer(String nameCustomer) {
		this.nameCustomer = nameCustomer;
	}
	public int getMoneyOfCustomer() {
		return moneyOfCustomer;
	}
	public void setMoneyOfCustomer(int moneyOfCustomer) {
		this.moneyOfCustomer = moneyOfCustomer;
	}
	public String getAddressCustomer() {
		return addressCustomer;
	}
	public void setAddressCustomer(String addressCustomer) {
		this.addressCustomer = addressCustomer;
	}
	public boolean isVip() {
		return vip;
	}
	public void setVip(boolean vip) {
		this.vip = vip;
	}
	
	public void printVipCustomer() {
		System.out.println("VIP");
	}
	
}
