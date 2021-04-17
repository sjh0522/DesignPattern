package BuilderPattern;

public class MainBuilderExample {
	
	public static void main(String[] args) {
		
		AerospaceEngineer aero = new AerospaceEngineer(); // Director 생성
		
		AirplaneBuilder crop = new CropDuster("Farmer Jeo"); // Farmer Jeo라는 이름으로 concreteBuilder(CropDuster) 생성
		AirplaneBuilder	fighter = new FighterJet ("The Navy");
		AirplaneBuilder	glider = new Glider("Tim Rice");
		
		aero.setAirplaneBuilder(crop); // Director(aero) 에게 어떤 Builder(crop) 랑 같이 일하게 될지 세팅
		aero.constructAirplane();
		Airplane completedCropDuster = aero.getAirplane(); // Director(aero)가 Builder(crop) 에게 final product 요청
		System.out.println(completedCropDuster.getType () + " is completed and ready for delivery to " + completedCropDuster.getCustomer());
			
		// concreteBuilder를 교체함으로써 다른비행기를 만들수 있음
		aero.setAirplaneBuilder(fighter);
		aero.constructAirplane();
		Airplane completedFiterJet= aero.getAirplane();
		System.out.println(completedFiterJet.getType () + " is completed and ready for delivery to " + completedFiterJet.getCustomer());
		
		aero.setAirplaneBuilder(glider);
		aero.constructAirplane();
		Airplane completedGlider = aero.getAirplane();
		System.out.println(completedGlider.getType () + " is completed and ready for delivery to " + completedGlider.getCustomer());
	}
	
}
