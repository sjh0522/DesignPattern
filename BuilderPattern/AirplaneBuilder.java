package BuilderPattern;

public abstract class AirplaneBuilder {
	
	protected Airplane airplane;
	protected String customer;
	protected String type;
	
	public Airplane getAirplane() {
		return airplane;
	}
	
	// 비행기 만드는 step
	// detail은 concrete Builder에서 implementation
	public void createNewAirplane() {
		airplane = new Airplane(customer, type);
	}
	public abstract void buildWings();
	public abstract void buildPowerplant();
	public abstract void buildAvionics();
	public abstract void buildSeats();

}
