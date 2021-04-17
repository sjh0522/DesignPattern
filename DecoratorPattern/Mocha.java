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
		// �ڱ��ڽ� cost .20 + ���� �ٹ̰� �ִ� decorator ��ü�� cost
		return .20 + beverage.cost();
	} 
	
}
