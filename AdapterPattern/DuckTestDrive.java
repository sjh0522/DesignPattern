package Adapter;

public class DuckTestDrive {
	
	public static void main (String[] arg) {
		MallardDuck md = new MallardDuck();
		WildTurkey wt = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(wt); // Duck : target interface type으로 return, turkeyAdapter : 실제는 turkey
		
		System.out.println("The Turkey says....");
		wt.gobble();
		wt.fly();
		
		System.out.println("\nThe Duck says....");
		md.quack();
		md.fly();
		
		System.out.println("\nThe TurkeyAdapter says....");
		turkeyAdapter.quack();
		turkeyAdapter.fly();
		
		System.out.println("\nThe TurkeyAdapter says....(testDuck)");
		testDuck(turkeyAdapter);
	}
	
	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
