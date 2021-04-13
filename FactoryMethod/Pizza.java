package FactoryMethod;

import java.util.ArrayList;

public class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList toppings = new ArrayList();
	
	void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings : ");
		for (int i = 0; i<toppings.size(); i++) {
			System.out.println("  " + toppings.get(i));
		}
	}
	void bake() {
		System.out.println("Bake for 25 min at 350");
	}
	
	void cut() {
		System.out.println("cutting");
	}
	
	void box() {
		System.out.println("boxing");
	}
	
	public String getName() {
		return name;
	}	
	
}
