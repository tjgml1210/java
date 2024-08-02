package test.t240715.object2;

public class Product {

		//Product 클래스를 작성하고, 키보드로 각 필드에 기록핛 값을 입력받아 객체 초기화에 사용한다. 
		//가격과 수량을 계산하여 구매가격을 출력한다.

		private String name;
		private int price;
		private int quantity;
		public Product() {
			super();
		}
		public Product(String name, int price, int quantity) {
			super();
			this.name = name;
			this.price = price;
			this.quantity = quantity;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		
		public String information() {
			return this.name + " " + this.price + " " + this.quantity;
		}
	

}
