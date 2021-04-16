package TemplateMethodPattern;

public class Tea extends CaffeineBeverage{

	@Override
	public void brew() {
		System.out.println("Steeping the tea");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding Lemon");
	}
	
	// boolean customerWantsCondiments() override 안함으로써 parent Class 에 개입 안함
	
}
