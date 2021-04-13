package FactoryMethod;

public class ChicagoStyleVeggiePizza extends Pizza{
	public ChicagoStyleVeggiePizza() {
		name = "Chicago Style Pizza";
		dough = "Thin";
		sauce = "Veggie Sauce";
		toppings.add("Tomato, cabbage");
	}
}
