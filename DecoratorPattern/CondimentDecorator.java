package Decorator;

public abstract class CondimentDecorator extends Beverage{ // inheritance
	
	// inheritance : Beverage�� �θ�� ����
	// association : �ٹ̰��� �ϴ� Beverage instance�� ����Ŵ 
	protected Beverage beverage;  // association
	
	public abstract String getDescription();
	
}
