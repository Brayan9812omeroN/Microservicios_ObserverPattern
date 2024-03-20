package Payment;

import java.util.ArrayList;
import java.util.List;

import Interfaces.IObserver;

public class payment {
	private List<IObserver> purchase = new ArrayList<>();
	
	
	public void attach(IObserver purchase) {
		this.purchase.add(purchase);
	}
	
	public void detachh(IObserver purchase) {
		this.purchase.remove(purchase);
	}
	
	public void notify(String message) {
		for(IObserver purchase : this.purchase) {
			purchase.update(message);
		}
	}
}