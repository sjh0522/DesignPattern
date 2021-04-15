package StrategyPattern;

public abstract class Duck {
	
	// attribute�� interface ref. �� ������ ����
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
	// Behavior ref.�� ��°�� ��ȯ
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
