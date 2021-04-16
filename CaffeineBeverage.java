package TemplateMethodPattern;

public abstract class CaffeineBeverage {
	/*
	 *  final : Skeleton은 subclass에서 override 하지 못하도록 */
	final void prepareRecipe() { 
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments()) addCondiments(); // hook method
	}
	
	/* 하위 Class에서 override하지 않으면 default로 addCondiments() 수행
	 * 하위 Class에서 parent Class 흐름에 개입하고 싶을때 override */
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
