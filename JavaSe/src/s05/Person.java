package s05;

public class Person {
	String name;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name) {
		this.name = name; 
	}
	
	public void getInfo() {
		System.out.println("Person类->"+this.name);
	}
	
	public boolean compare(Person p) {
		return this.name == p.name;
	}
	
	
	private int age;
	public void setAge(int i) {
		if(i>=0&&i<=130) {
			age =i;
		}else {
			System.out.println(this+"输入年龄错误，超出(0,130)范围");
		}
	}
	
	public int getAge() {
		return age;
	}
	
	
	
}
