package Users;

import Interfaces.IObserver;

public class users implements IObserver {
	private String name;
	
	public users(String name) {
		this.name = name;
	}
	
	@Override
	public void update(String message) {
		System.out.println(this.name + " Realizaste una compra: " + message);
	}
}