package ObserverPattern;

public class WeatherStation {
	public static void main(String[] arg) {
		WeatherData weatherData = new WeatherData();
		
		// concrete Observers, type의 종류에 관계없이 구독 신청 가능  
		// CurrentConditionDisplay constructor에서 구독 신청
		CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
			
		weatherData.setMeasurements(80, 65, 30);
		weatherData.setMeasurements(70, 67, 20);
	}

}
