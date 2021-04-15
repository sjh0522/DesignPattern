package StrategyPattern;

public class MallardDuck extends Duck{

	// constructor 할때 MallardDuck의 fly, quack의 성질을 flyBehavior, quackBehavior ref를 통해 지정해줌
	public MallardDuck() {
		flyBehavior = new FlyWithWings(); 
		quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("----------------------------------------");
		System.out.println("I`m a MallardDuck");
	}
	
}
