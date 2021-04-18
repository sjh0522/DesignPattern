package FactoryMethod;

public class ChicagoStyleCheesePizza extends Pizza{
	public ChicagoStyleCheesePizza() {
		name = "Chicago Style Pizza";
		dough = "Extra Thick";
		sauce = "Plum Tomato Sauce";
		toppings.add("Shredded Mozzarella Cheese");
	}
	void bake() {
		System.out.println("Chicago-Bake for 25 min at 350");
	}
	
	void cut() {
		System.out.println("Chicago-cutting");
	}
	
	void box() {
		System.out.println("Chicago-boxing");
	}
}
