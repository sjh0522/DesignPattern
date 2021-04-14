package Decorator;

public class StarbuzzCoffee {
	
	public static void main(String[] arg) {
		Beverage beverage1 = new Espresso();
		System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
		
		beverage1 = new Mocha(beverage1);
		System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
		
		beverage1 = new Mocha(beverage1);		
		System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
		
		Beverage beverage2 = new DarkRoast();
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		beverage2 = new Mocha(beverage2);
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
	}

}
