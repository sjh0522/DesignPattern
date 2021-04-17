package BuilderPattern;

public class AerospaceEngineer {
	
	private	AirplaneBuilder airplaneBuilder; // 같이 일하게 될 concreteBuilder ref
	
	public void	setAirplaneBuilder (AirplaneBuilder ab) {
		airplaneBuilder = ab;
	}
	
	public Airplane	getAirplane () {
		return	airplaneBuilder.getAirplane();
	}
	// Airplane 조립 step,parts만 알고, detail은 모름 
	public void	constructAirplane () {
		airplaneBuilder.createNewAirplane();
		airplaneBuilder.buildWings();
		airplaneBuilder.buildPowerplant();
		airplaneBuilder.buildAvionics();
		airplaneBuilder.buildSeats();
	}
	
}
