package test.t240710.object2;

public class Product {

	private String pName;
	private int price;
	private String brand;
	
	public Product() {

	}
	
	public Product(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		this.brand = brand;
	}
	
	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	
	public void informaion() {
		System.out.println("이름 : " + this.pName + "\n가격 : " + price + "\n브랜드 : " + this.brand);
	}
	
}
