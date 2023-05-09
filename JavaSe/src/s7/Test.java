package s7;

public class Test {
	public static void main(String[] args) {
		Manager m = new Manager();
		
		System.out.println(m.numsOfReports);
		System.out.println(m.getName());
		
		m.receivesPay();
	}
}
