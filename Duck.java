package StrategyPattern;

public abstract class Duck {
	
	// attribute로 interface ref. 를 가지고 있음
	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;
	
	// delegate
	public void performQuack() {
		quackBehavior.quack(); 
	}
	public void performFly() {
		flyBehavior.fly();
	}
	
	// delegate
	// Behavior ref.를 통째로 교환
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior=qb;
	}
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior=fb;
	}
	
	public void swim() {
		System.out.println("swim");
	}
	abstract public void display();	
	
}
