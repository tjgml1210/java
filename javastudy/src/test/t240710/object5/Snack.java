package test.t240710.object5;

public class Snack {
	private String kind;
	private String name;
	private String flavor;
	private int numOf;
	private int price;
	
	public Snack() {
		super();
//		System.out.println("Snack 생성됨");
	}
	
	public Snack(String kind, String name, String flavor, int numOf, int price) {
		super();
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
	}
	
	public String information() {
		String info = this.kind + "(" + this.name + "-" + this.flavor + ") " + 
						this.numOf + "개 " + this.price + "원";
		
		return info;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFlavor() {
		return flavor;
	}