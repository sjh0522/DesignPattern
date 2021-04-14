package BuilderPattern;

public class Glider extends AirplaneBuilder{
	Glider(String customer){
		super.customer = customer;
		super.type = "Glider v9.0";
	}
	
	public void buildWings() {
		airplane.setWingspan(57.1f);
	}
	public void	buildPowerplant () {}
	public void	buildAvionics () {};
	public void	buildSeats() {
		airplane.setNumberSeats(1,0);
	}
}
