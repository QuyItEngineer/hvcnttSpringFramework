package day6;

public class Employee {
	
	private String nameEmployee;
	private int ageEmployee;
	private int idEmployee;
	public Employee() {
	}
	public Employee(String name, int age, int id) {
		this.setNameEmployee(name);
		this.setAgeEmployee(age);
		this.setIdEmployee(id);
	}
	public String getNameEmployee() {
		return nameEmployee;
	}
	public void setNameEmployee(String nameEmployee) {
		this.nameEmployee = nameEmployee;
	}
	public int getAgeEmployee() {
		return ageEmployee;
	}
	public void setAgeEmployee(int ageEmployee) {
		this.ageEmployee = ageEmployee;
	}
	public int getIdEmployee() {
		return idEmployee;
	}
	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}

	public String getInfomationEmployee() {
		return "Name Employee: "+this.getNameEmployee()+".\n"
				+"Age Employee: "+this.getAgeEmployee()+".\n"
				+"id Employee: "+this.getIdEmployee()+".";
	}
	public void print() {
		System.out.println("hello "+ this.getNameEmployee());
	}
}
