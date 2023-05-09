package s7;

public class TestStu {
	public static void main(String[] args) {
		Student student = new Student("张三",119);
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.say());
		
		Person student1 = new Student("张三",119);
//		System.out.println(student1.getId());
		System.out.println(student1.getName());
		System.out.println(student1.say());
	}
}
