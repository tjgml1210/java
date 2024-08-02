package project.ssh;

public class Cart extends Movie{
	private boolean cart;

	
	public Cart() {
		super();
	}


	public Cart(boolean cart) {
		super();
		this.cart = cart;
	}


	public boolean isCart() {
		return cart;
	}


	public void setCart(boolean cart) {
		this.cart = cart;
	}


	@Override
	public String toString() {
		return "Cart [cart=" + cart + "]";
	}
	
	
}
