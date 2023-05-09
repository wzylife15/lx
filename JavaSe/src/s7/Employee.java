package s7;

public class Employee {
	private String name ="张三";
	private String address;
	private float salary;
	
	public void receivesPay() {
		System.out.println(name+": "+salary);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
}
