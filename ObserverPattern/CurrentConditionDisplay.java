package ObserverPattern;
// import java.util.Observable;
// import java.util.Observer;
// Observer library �� import �� implementation

public class CurrentConditionDisplay implements Observer, DisplayElement{
	
	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	// Observer library : private Subject weatherData -> Observable observable ����

	public CurrentConditionDisplay(Subject weatherData) { // sub �ϰ����ϴ� pub�� ����
		this.weatherData = weatherData;
		weatherData.registerObserver(this); // ���� ��û
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
	
	
	/* Observable, Observer Library ��� ��
	 * 
	public CurrentConditionDisplay(Observable observable) { // sub �ϰ����ϴ� pub�� ����
		this.observable = observable;
		observable.addObserver(this); // ���� ��û
	}
	
	// data�� arg�� �Ƿ��� ���� �ʰ� WeatherData�� ����
	// Pull ��� : WeatherData�� notify()�� �ϰ� concreteObserver���� get API�� ���� Data query ����  
	public void update(Observable obs, Object arg) { obs : data�� ������ Observable�� ref, arg : data�� arg�� ���޵� ���
		if(obs instanceof WeatherData){
			WeatherData weatherData = (WeatherData) obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}		
	}
	*/
	
}
