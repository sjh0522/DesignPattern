package FactoryMethod;

public abstract class PizzaStore {
	
	// framework 제공
	// 피자를 만들기 위한 일반적인 비즈니스 로직을 제공
	public Pizza orderPizza(String type) {
		Pizza pizza;
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	abstract Pizza createPizza(String type);
	
}
