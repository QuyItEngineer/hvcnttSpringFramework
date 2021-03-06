package day6;


public class SwimmingPool {

	private String nameSwimmingPool;
	private String timeOpenSwimmingPool;
	private Employee employee;
	public SwimmingPool() {
		
	}
	public SwimmingPool(Employee employee) {
		this.employee = employee;
	}
	public SwimmingPool(String name, String timeOpen,Employee employee) {
		this.setNameSwimmingPool(name);
		this.setTimeOpenSwimmingPool(timeOpen);
		this.employee = employee;
	}
	
	public String getNameSwimmingPool() {
		return nameSwimmingPool;
	}


	public void setNameSwimmingPool(String nameSwimmingPool) {
		this.nameSwimmingPool = nameSwimmingPool;
	}


	public String getTimeOpenSwimmingPool() {
		return timeOpenSwimmingPool;
	}


	public void setTimeOpenSwimmingPool(String timeOpenSwimmingPool) {
		this.timeOpenSwimmingPool = timeOpenSwimmingPool;
	}


	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


	public void printSwimmingPool() {
		System.out.println("Name: "+this.getNameSwimmingPool()+".\n"
				+"Time Open: "+this.getTimeOpenSwimmingPool()+".\n"
				+this.employee.getInfomationEmployee());
	}
}
