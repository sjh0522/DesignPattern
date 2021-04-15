package StrategyPattern;

public class ModelDuck extends Duck{
	
	public ModelDuck() {
		flyBehavior = new FlynoWay();
		quackBehavior = new Squeak();
	}

	@Override
	public void display() {
		System.out.println("----------------------------------------");
		System.out.println("Model Duck!");		
	}
	
}
