package s7;

public class Computer {
	private String name;

	public Computer() {
		super();
	}

	public Computer(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Computer [name=" + name + "]";
	}
	
}
