package ObserverPattern;
import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement{ // Observer library
	
	private float temperature;
	private float humidity;
	private float pressure;
	// private Subject weatherData -> Observable observable 변경
	Observable observable; 
	
	public CurrentConditionDisplay(Observable observable) { // sub 하고자하는 pub의 정보
		this.observable = observable;
		observable.addObserver(this); // 구독 신청
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
