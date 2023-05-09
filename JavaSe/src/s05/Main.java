package s05;

public class Main {
	public static void main(String[] args) {
		Animal xb = new Animal();
		xb.setLegs(-2);
		System.out.println(xb.getLegs());	
		xb.eat();
		xb.move();
	}
}
