package Inventory;

import Interfaces.IObserver;

public class inventory implements IObserver {
	private String name;
	
	public inventory(String name) {
		this.name = name;
	}
	
	@Override
	public void update(String message) {
		System.out.println(this.name + " Se vendio: " + message);
	}
}