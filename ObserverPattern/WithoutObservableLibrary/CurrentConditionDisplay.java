package ObserverPattern;

public class CurrentConditionDisplay implements Observer, DisplayElement{
	
	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	
	public CurrentConditionDisplay(Subject weatherData) { // sub 하고자하는 pub의 정보
		this.weatherData = weatherData;
		weatherData.registerObserver(this); // 구독 신청
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();		
	}	
	@Override
	public void display() {
		System.out.println("Current conditions : " + temperature + "F degrees and" + humidity + "% humidity" + pressure + " presure");		
	}
	
}
