import Users.users;
import Payment.payment;
import ShoppingCart.shoppingcart;
import Inventory.inventory;

import Payment.payment;

public class Main {

	public static void main(String[] args) {
		payment notifier = new payment();
		
		users purchase_user = new users("Camilo");
		inventory purchase_product = new inventory("Mouse");
		shoppingcart purchase_carrito = new shoppingcart("Mouse");
		
		notifier.attach(purchase_user);
		notifier.attach(purchase_product);
		notifier.attach(purchase_carrito);
		
		notifier.notify("Compra exitosa");
		
		//notifier.detachh(subscriberOne);
		
	}


}
