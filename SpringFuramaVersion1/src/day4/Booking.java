package day4;

import java.util.Date;

public class Booking {
	private int idBooking;
	private Date dateBooking;
	private float costBooking;
	private int numberMember;
	
	public int getIdBooking() {
		return idBooking;
	}
	public void setIdBooking(int idBooking) {
		this.idBooking = idBooking;
	}
	public Date getDateBooking() {
		return dateBooking;
	}
	public void setDateBooking(Date dateBooking) {
		this.dateBooking = dateBooking;
	}
	public float getCostBooking() {
		return costBooking;
	}
	public void setCostBooking(float costBooking) {
		this.costBooking = costBooking;
	}
	public int getNumberMember() {
		return numberMember;
	}
	public void setNumberMember(int numberMember) {
		this.numberMember = numberMember;
	}
	
	public void printCustomerBooking () {
		System.out.println("Id booking: "+this.idBooking+".");
	}
	
	
}
