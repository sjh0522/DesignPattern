package StatePattern;

public class NoQuarterState implements State{
	
	GumballMachine gumballMachine; // GumballMachine ref 필요
	
	public NoQuarterState(GumballMachine gumballMachine) { // constructor
		this.gumballMachine = gumballMachine;
	}
	
	// currState(NoQuarterState)에서 event에 대한 action 정의 
	public void insertQuarter() {
		 System.out.println("You inserted a quarter");
		 gumballMachine.setState(gumballMachine.getHasQuarterState());
	}
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
	}
	public void turnCrank() {
		System.out.println("You turned, but there's no quarter");
	}
	public void dispense() {
		System.out.println("You need to pay first");
	}
	
}
