package test.t240716.object4;

public class Student extends Human{
	
	private int number;
	private String major;
	
	public Student() {
		super();
	}

	public Student(String name, int age, int height, int weight, int number, String major) {
		super(name, age, height, weight);
		this.number = number;
		this.major = major;
	}

	@Override
	public String toString() {
		return super.toString() +" "+ this.number  + " " + this.major;
	}
	
	
}
