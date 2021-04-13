package FactoryMethod;

public class ChicagoPizzaStore extends PizzaStore{

	@Override
	Pizza createPizza(String type) {
		if(type.equals("cheese")) return new ChicagoStyleCheesePizza();		
		else if (type.equals("veggie")) return new ChicagoStyleVeggiePizza();
		//else if (type.equals("clam")) return new NYStyleClamPizza();
		//else if (type.equals("pepperoni")) return new NYStylePepperoniPizza();
		return null;
	}

}
