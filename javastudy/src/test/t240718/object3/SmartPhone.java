package test.t240718.object3;

public abstract class SmartPhone implements CellPhone,TouchDisplay{
	private String maker;

	public SmartPhone() {
		super();
		this.getMaker();
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	public abstract String printInformation();
	
	
	
}
