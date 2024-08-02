package test.t240719.object4;

public abstract class  Animal {
	private String name;
	private String kinds;
	
	protected Animal() {
	}
	
	protected Animal(String name, String kinds) {
		super();
		this.name = name;
		this.kinds = kinds;
	}


	public String toString() {
		return "저의 이름은 " + name + "이고, 종류는 " + kinds + "입니다.";
	}
	
	public abstract void speak();
}
