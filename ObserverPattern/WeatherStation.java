package ObserverPattern;

public class WeatherStation {
	public static void main(String[] arg) {
		WeatherData weatherData = new WeatherData();
		
		// concrete Observers, type�� ������ ������� ���� ��û ����  
		// CurrentConditionDisplay constructor���� ���� ��û
		CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
			
		weatherData.setMeasurements(80, 65, 30);
		weatherData.setMeasurements(70, 67, 20);
	}

}
