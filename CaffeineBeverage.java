package TemplateMethodPattern;

public abstract class CaffeineBeverage {
	/*
	 *  final : Skeleton�� subclass���� override ���� ���ϵ��� */
	final void prepareRecipe() { 
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments()) addCondiments(); // hook method
	}
	
	/* ���� Class���� override���� ������ default�� addCondiments() ����
	 * ���� Class���� parent Class �帧�� �����ϰ� ������ override */
	boolean customerWantsCondiments() {  
		return true;
	}

	abstract void brew();
	abstract void addCondiments();

	public void pourInCup() {
		System.out.println("Pouring into cup");
	}

	public void boilWater() {
		System.out.println("Boiling water");
	}	
}
