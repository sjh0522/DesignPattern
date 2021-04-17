package StatePattern;

import java.util.Random;

public class HasQuarterState implements State{
	
	GumballMachine gumballMachine; 
	Random randomWinner = new Random(System.currentTimeMillis()); // for winner state
	
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	 public void insertQuarter() {
		 System.out.println("You can't insert another quarter");
	 }
	 public void ejectQuarter() {
		 System.out.println("Quarter returned");
	     gumballMachine.setState(gumballMachine.getNoQuarterState());
	 }
	 public void turnCrank() {
		 System.out.println("You turned...");
		 // for winner state
		 int winner = randomWinner.nextInt(10);
		 if(winner == 0 && gumballMachine.getCount()>1) {
			 gumballMachine.setState(gumballMachine.getWinnerState());
		 }else {
			 gumballMachine.setState(gumballMachine.getSoldState());
		 }
	     gumballMachine.dispense();
	 }
	 
	 public void dispense() {
		 System.out.println("No gumball dispensed");
	 }

}
