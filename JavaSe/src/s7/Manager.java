package s7;

public class Manager extends Employee {
	int numsOfReports = 250;
	int officeId = 123;
	float bonus = 1000.0f;
	
	@Override
	public void receivesPay() {
		// TODO Auto-generated method stub
		System.out.println(this.getName()+":--salary: "+this.getSalary()+" bonus: "+bonus);
	}
	
	public void hires() {
		numsOfReports=300;
		this.setName("李四");
	}
	
	public void plans() {
		
	}
}
