package StatePattern;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		//GumballMachine_BAD gumballMachine = new GumballMachine_BAD(5);
		GumballMachine gumballMachine = new GumballMachine(2);
		
		
        //System.out.println(gumballMachine);
		System.out.println("State : " + gumballMachine.getState());
		System.out.println("quarter : " + gumballMachine.getCount());
        gumballMachine.insertQuarter();
        System.out.println("State : " + gumballMachine.getState());
        System.out.println("quarter : " + gumballMachine.getCount());
        gumballMachine.turnCrank();
        System.out.println("State : " + gumballMachine.getState());
        System.out.println("quarter : " + gumballMachine.getCount());
        
        //System.out.println(gumballMachine);
        gumballMachine.insertQuarter();
        System.out.println("State : " + gumballMachine.getState());
		System.out.println("quarter : " + gumballMachine.getCount());
        gumballMachine.turnCrank();
        System.out.println("State : " + gumballMachine.getState());
		System.out.println("quarter : " + gumballMachine.getCount());
        gumballMachine.insertQuarter();
        System.out.println("State : " + gumballMachine.getState());
		System.out.println("quarter : " + gumballMachine.getCount());
        gumballMachine.turnCrank();
        System.out.println("State : " + gumballMachine.getState());
		System.out.println("quarter : " + gumballMachine.getCount());

        /*System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);*/

	}

}
