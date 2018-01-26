package day5;

public class Payment {
	private Order order;
	public Payment(Order order) {
		this.order=order;
	}
	public void printCustomerPayment () {
		System.out.println("Money of Bill: "+this.order.getCostOrder()+" USD.");
	}
	public void printAllBillCustomerPayment () {
		System.out.println("Money of Bill: "+this.order.getCostOrder()+" USD.\n"
				+"Date of stay: "+this.order.getTotalDate()+".\n"
				+"Date print to Order: "+this.order.getDateOutOrder());
	}
}
