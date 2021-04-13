package FactoryMethod;

public class PizzaTestDrive {

	public static void main(String[] args) {
		// �� ������ �´� �� ���� ���Ը� �����Ѵ�.
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        
        // �� ������ �´� ���ڸ� �����.
        Pizza pizza1 = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza1.getName() + "\n");
        //Pizza pizza2 = nyStore.orderPizza("veggie");
        //System.out.println("Ethan ordered a " + pizza2.getName() + "\n");
        
        Pizza pizza3 = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza3.getName() + "\n");
	}
}
