package Payment;

import java.util.ArrayList;
import java.util.List;

import Interfaces.IObserver;

public class payment {
	private List<IObserver> subscribers = new ArrayList<>();
	
	
	public void attach(IObserver subscriber) {
		this.subscribers.add(subscriber);
	}
	
	public void detachh(IObserver subscriber) {
		this.subscribers.remove(subscriber);
	}
	
	public void notify(String message) {
		for(IObserver subscriber : this.subscribers) {
			subscriber.update(message);
		}
	}
}