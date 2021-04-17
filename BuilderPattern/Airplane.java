package BuilderPattern;

public class Airplane {
	
	private String type;
	private float wingspan;
	private String powerplant;
	private	int crewSeats;
	private	int passengerSeats;
	private String avionics;
	private String customer;
	
	// constructor
	public Airplane(String customer, String type){
		this.customer = customer;
		this.type = type;
	}
	
	// getter, setter
	public void	setWingspan (float w) { 
		this.wingspan = w;
	}
	public void	setPowerplant (String p) { 
		this.powerplant = p;
	}
	public void setAvionics (String a) { 
		this.avionics = a;	
	}
	public void	setNumberSeats(int crewSeats , int passengerSeats ) {
		this.crewSeats = crewSeats;
		this.passengerSeats	= passengerSeats;
	}	
	public String getCustomer () { 
		return customer;
	}
	public String getType () { 
		return type;
	}

}
