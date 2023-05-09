package s05;

public class Animal {
	private int legs;
	
	public void setLegs(int i) {
		if(i!=0 &&i!=2 &&i!=4) {
			System.out.println("Wrong number of legs!");
			return;
		}
		legs = i;
	}
	
	public int getLegs() {
		return legs;
	}
	
	public void eat() {
		System.out.println("Eating");
	}
	
	public void move() {
		System.out.println("Move.");
	}
}
