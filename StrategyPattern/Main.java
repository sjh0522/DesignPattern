package StrategyPattern;

public class Main {

	public static void main(String[] args) {
		/* type을 상위객채 type으로 지정해줌 
		 * constructor에서 flyBehavior, quackBehavior 설정되어있음 */
		Duck mallard = new MallardDuck(); 
		mallard.display();
		mallard.performQuack();
		mallard.performFly();
		
		Duck model = new ModelDuck();
		model.display();
		model.performQuack();
		model.performFly();
		/* flyBehavior 하위 class를 ModelDuck()생성할때 설정된 new FlynoWay(); -> new FlyRocketPowered() 변경
		 * flyBehavior 하위 class를 통째로 갈아끼운다고 생각 */
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		model.setFlyBehavior(new FlyWithWings());
		model.performFly();
	}

}
