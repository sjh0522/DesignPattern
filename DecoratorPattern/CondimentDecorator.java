package Decorator;

public abstract class CondimentDecorator extends Beverage{ // inheritance
	
	// inheritance : Beverage를 부모로 가짐
	// association : 꾸미고자 하는 Beverage instance를 가리킴 
	protected Beverage beverage;  // association
	
	public abstract String getDescription();
	
}
