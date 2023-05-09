package s7;

public class Teacher {
	private String name;
	private Computer notePad = new Computer("联想");
	
	
	
	public Teacher(String name) {
		super();
		this.name = name;
	}



	public Teacher(String name, Computer notePad) {
		super();
		this.name = name;
		this.notePad = notePad;
	}



	@Override
	public String toString() {
		return "Teacher [name=" + name + ", notePad=" + notePad + "]";
	}
	
	
}
