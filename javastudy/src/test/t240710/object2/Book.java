package test.t240710.object2;

public class Book {

	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	public Book() {
		this("미입력","미정","미입력",0,0);
	}

	public Book(String title, String publisher, String author) {
		this(title,publisher,author,0,0);
//		this.title = title;
//		this.publisher = publisher;
//		this.author = author;
	}
	

	public Book(String title, String publisher, String author, int pice, double discountRate) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = pice;
		this.discountRate = discountRate;
	}
	
	public void inform() {
		System.out.println();
		System.out.println("제목 : " + this.title);
		System.out.println("출판사 : " + this.publisher);
		System.out.println("저자 : " + this.author);
		System.out.println("가격 : " + this.price + "원");
		System.out.println("할인률 : " + this.discountRate + "%");
	}
	
	
}