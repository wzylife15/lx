package s05;

public class TestAge {
	public static void main(String[] args) {
		Person p1 = new Person("张三");
		Person p2 = new Person("李四");
		
		p1.setAge(66);
		p2.setAge(-1);
		p1.getInfo();
		p2.getInfo();
		System.out.println(p1.compare(p2));
	}
}
