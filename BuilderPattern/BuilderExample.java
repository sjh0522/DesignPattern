package BuilderPattern;

public class BuilderExample {

	public static void main(String[] args) {
		AerospaceEngineer aero = new AerospaceEngineer();
		
		AirplaneBuilder crop = new CropDuster("Farmer Jeo");
		AirplaneBuilder	fighter = new FighterJet ("The Navy");
		AirplaneBuilder	glider = new Glider("Tim Rice");
		
		aero.setAirplaneBuilder(crop);
		aero.constructAirplane();
		Airplane completedCropDuster1 = aero.getAirplane();
		System.out.println(completedCropDuster1.getType () + " is completed and ready for delivery to " + completedCropDuster1.getCustomer());
		
		aero.setAirplaneBuilder(fighter);
		aero.constructAirplane();
		Airplane completedCropDuster2 = aero.getAirplane();
		System.out.println(completedCropDuster2.getType () + " is completed and ready for delivery to " + completedCropDuster2.getCustomer());
		
		aero.setAirplaneBuilder(glider);
		aero.constructAirplane();
		Airplane completedCropDuster3 = aero.getAirplane();
		System.out.println(completedCropDuster3.getType () + " is completed and ready for delivery to " + completedCropDuster3.getCustomer());
	}

}
