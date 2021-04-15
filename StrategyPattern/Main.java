package StrategyPattern;

public class Main {

	public static void main(String[] args) {
		/* type�� ������ä type���� �������� 
		 * constructor���� flyBehavior, quackBehavior �����Ǿ����� */
		Duck mallard = new MallardDuck(); 
		mallard.display();
		mallard.performQuack();
		mallard.performFly();
		
		Duck model = new ModelDuck();
		model.display();
		model.performQuack();
		model.performFly();
		/* flyBehavior ���� class�� ModelDuck()�����Ҷ� ������ new FlynoWay(); -> new FlyRocketPowered() ����
		 * flyBehavior ���� class�� ��°�� ���Ƴ���ٰ� ���� */
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		model.setFlyBehavior(new FlyWithWings());
		model.performFly();
	}

}
