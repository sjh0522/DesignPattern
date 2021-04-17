package ObserverPattern;
// import java.util.Observable;
// import java.util.Observer;
// Observer library 시 import 후 implementation

public class CurrentConditionDisplay implements Observer, DisplayElement{
	
	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	// Observer library : private Subject weatherData -> Observable observable 변경

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
	
	
	/* Observable, Observer Library 사용 시
	 * 
	public CurrentConditionDisplay(Observable observable) { // sub 하고자하는 pub의 정보
		this.observable = observable;
		observable.addObserver(this); // 구독 신청
	}
	
	// data는 arg에 실려서 오지 않고 WeatherData에 있음
	// Pull 방식 : WeatherData는 notify()만 하고 concreteObserver에서 get API를 통해 Data query 수행  
	public void update(Observable obs, Object arg) { obs : data를 전달한 Observable의 ref, arg : data가 arg로 전달된 경우
		if(obs instanceof WeatherData){
			WeatherData weatherData = (WeatherData) obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}		
	}
	*/
	
}
