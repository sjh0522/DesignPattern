package StatePattern;

public class GumballMachine {
	State soldOutState;
	State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState; // winnerState 추가
    State state;
    int count=0;
    
    public GumballMachine(int numberGumballs) {
    	noQuarterState = new NoQuarterState(this);
    	soldOutState = new SoldOutState(this);
    	hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this); // winnerState 추가
        
        this.count = numberGumballs;
        if(numberGumballs>0) state = noQuarterState; // 초기 noQuarterState setting 
        else state = soldOutState; 
    }
    
    // state에게 위임
    public void insertQuarter() { 
    	state.insertQuarter();
    }
    public void ejectQuarter() {
        state.ejectQuarter();
    }
    public void turnCrank() {
        state.turnCrank();
    }
    public void dispense() {
        state.dispense();
    }
    
    // getter, setter
    void setState(State state) {
    	this.state = state;
    }
    public State getState() {
        return state;
    }
    public State getSoldOutState() {
        return soldOutState;
    }
    public State getNoQuarterState() {
        return noQuarterState;
    }
    public State getHasQuarterState() {
        return hasQuarterState;
    }
    public State getSoldState() {
        return soldState;
    }   
    public State getWinnerState() {
        return winnerState;
    }  
    
    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) count -= 1;
    }
    int getCount() {
        return count;
    }
    
}
