package Decorator;

public class Mocha extends CondimentDecorator{
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage; // association
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + "Mocha";
	}
	@Override
	public double cost() {
		// 자기자신 cost .20 + 내가 꾸미고 있는 decorator 객체의 cost
		return .20 + beverage.cost();
	} 
	
}
