package TemplateMethodPattern;

import java.util.Scanner;

public class Coffee extends CaffeineBeverage{

	@Override
	public void brew() {
		System.out.println("Dripping Coffee through filter");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding sugar and milk");
	}
	
	public boolean customerWantsCondiments() { // hook method
		Scanner scan = new Scanner(System.in);
		System.out.println("첨가물을 원하면 1을 입력하세요.");
		int answer = scan.nextInt();
		if(answer == 1) return true;
		else return false;
	}

}
