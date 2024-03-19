import Users.users;
import Payment.payment;
import ShoppingCart.shoppingcart;
import Inventory.inventory;

import Payment.payment;

public class Main {

	public static void main(String[] args) {
		payment notifier = new payment();
		
		users subscriberOne = new users("Nicolas");
		users subscriberTwo = new users("Juan");
		
		notifier.attach(subscriberOne);
		notifier.attach(subscriberTwo);
		
		notifier.notify("Compra exitosa");
		
		notifier.detachh(subscriberOne);
		
	}


}
