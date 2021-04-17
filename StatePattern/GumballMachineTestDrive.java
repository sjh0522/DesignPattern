package StatePattern;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		//GumballMachine_BAD gumballMachine = new GumballMachine_BAD(5);
		GumballMachine gumballMachine = new GumballMachine(50);
		
        //System.out.println(gumballMachine);
		/*System.out.println("State : " + gumballMachine.getState());
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
		System.out.println("quarter : " + gumballMachine.getCount());*/

        System.out.println(gumballMachine);
       
       for(int i=0; i<50;i++) {
        	System.out.println(i + "=============================");
        	gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
        }

	}

}
