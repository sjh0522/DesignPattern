package Decorator;

public abstract class Beverage {
	String description = "NO Title";
	
	public String getDescription() {
		return description;
	}
	public abstract double cost();
}
