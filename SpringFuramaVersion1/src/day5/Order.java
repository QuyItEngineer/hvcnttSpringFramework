package day5;

import java.util.Date;

public class Order{
	private float costOrder;
	private int totalDate;
	private Date dateOutOrder;
	
	public int getTotalDate() {
		return totalDate;
	}
	public void setTotalDate(int totalDate) {
		this.totalDate = totalDate;
	}
	public Date getDateOutOrder() {
		return dateOutOrder;
	}
	public void setDateOutOrder(Date dateOutOrder) {
		this.dateOutOrder = dateOutOrder;
	}
	public float getCostOrder() {
		return costOrder;
	}
	public void setCostOrder(float costOrder) {
		this.costOrder = costOrder;
	}
	
	
}
