package FactoryMethod;

public class NYStyleCheesePizza extends Pizza{
	public NYStyleCheesePizza() {
		name = "NY Style Pizza";
		dough = "Thin";
		sauce = "Marinara Sauce";
		toppings.add("toppings");
	}
	
	void bake() {
		System.out.println("NY-Bake for 25 min at 350");
	}
	
	void cut() {
		System.out.println("NY-cutting");
	}
	
	void box() {
		System.out.println("NY-boxing");
	}
}
