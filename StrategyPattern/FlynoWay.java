package StrategyPattern;

public class FlynoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I Cannot Fly");		
	}
}
