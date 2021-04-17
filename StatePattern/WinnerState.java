package StatePattern;

public class WinnerState implements State{
	
	GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a Gumball");
    }
    public void ejectQuarter() {
        System.out.println("Please wait, we're already giving you a Gumball");
    }
    public void turnCrank() {
        System.out.println("Turning again doesn't get you another gumball!");
    }
    public void dispense() {
		 System.out.println("You are a WINNER! You get two gumball");
		 gumballMachine.releaseBall();
		 gumballMachine.releaseBall();
		 if(gumballMachine.getCount() > 0 ) {
			 gumballMachine.setState(gumballMachine.getNoQuarterState());
		 }else {
			 gumballMachine.setState(gumballMachine.getSoldOutState());
		 }    
    }

}
