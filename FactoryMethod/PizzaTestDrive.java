package FactoryMethod;

public class PizzaTestDrive {

	public static void main(String[] args) {
		// 각 지점에 맞는 두 피자 가게를 생성한다.
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        
        // 각 지점에 맞는 피자를 만든다.
        Pizza pizza1 = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza1.getName() + "\n");
        //Pizza pizza2 = nyStore.orderPizza("veggie");
        //System.out.println("Ethan ordered a " + pizza2.getName() + "\n");
        
        Pizza pizza3 = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza3.getName() + "\n");
	}
}
