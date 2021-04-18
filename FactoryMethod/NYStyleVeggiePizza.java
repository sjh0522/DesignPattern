package FactoryMethod;

public class NYStyleVeggiePizza extends Pizza{
	public NYStyleVeggiePizza() {
		name = "NY Style Pizza";
		dough = "Thin";
		sauce = "veggie Sauce";
		toppings.add("toppings");
	}
	void bake() {
		System.out.println("NY-Bake for 25 min at 350");
	}
	
}
