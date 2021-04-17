package BuilderPattern;

public class MainBuilderExample {
	
	public static void main(String[] args) {
		
		AerospaceEngineer aero = new AerospaceEngineer(); // Director ����
		
		AirplaneBuilder crop = new CropDuster("Farmer Jeo"); // Farmer Jeo��� �̸����� concreteBuilder(CropDuster) ����
		AirplaneBuilder	fighter = new FighterJet ("The Navy");
		AirplaneBuilder	glider = new Glider("Tim Rice");
		
		aero.setAirplaneBuilder(crop); // Director(aero) ���� � Builder(crop) �� ���� ���ϰ� ���� ����
		aero.constructAirplane();
		Airplane completedCropDuster = aero.getAirplane(); // Director(aero)�� Builder(crop) ���� final product ��û
		System.out.println(completedCropDuster.getType () + " is completed and ready for delivery to " + completedCropDuster.getCustomer());
			
		// concreteBuilder�� ��ü�����ν� �ٸ�����⸦ ����� ����
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
