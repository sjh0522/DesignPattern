package StrategyPattern;

public class MallardDuck extends Duck{

	// constructor �Ҷ� MallardDuck�� fly, quack�� ������ flyBehavior, quackBehavior ref�� ���� ��������
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
