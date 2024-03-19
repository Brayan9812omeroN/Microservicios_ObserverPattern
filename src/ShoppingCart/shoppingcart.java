package ShoppingCart;

import Interfaces.IObserver;

public class shoppingcart implements IObserver {
	private String name;
	
	public shoppingcart(String name) {
		this.name = name;
	}
	
	@Override
	public void update(String message) {
		System.out.println(this.name + " Sale del carrito de compras: " + message);
	}
}