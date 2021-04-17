package BuilderPattern;

public class AerospaceEngineer {
	
	private	AirplaneBuilder airplaneBuilder; // ���� ���ϰ� �� concreteBuilder ref
	
	public void	setAirplaneBuilder (AirplaneBuilder ab) {
		airplaneBuilder = ab;
	}
	
	public Airplane	getAirplane () {
		return	airplaneBuilder.getAirplane();
	}
	// Airplane ���� step,parts�� �˰�, detail�� �� 
	public void	constructAirplane () {
		airplaneBuilder.createNewAirplane();
		airplaneBuilder.buildWings();
		airplaneBuilder.buildPowerplant();
		airplaneBuilder.buildAvionics();
		airplaneBuilder.buildSeats();
	}
	
}
