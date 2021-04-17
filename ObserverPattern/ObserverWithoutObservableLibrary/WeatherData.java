package ObserverPattern;

import java.util.ArrayList;

public class WeatherData implements Subject{
	
	private ArrayList<Observer> observers; // observers 보관, 누가 observers 인가?
	private float temperature;
	private float humidity;
	private float pressure;
	
	// constructor에서 observers초기화
	public WeatherData() { 
		observers = new ArrayList<Observer>();
	}
	// Observable, Observer 라이브러리 사용시
	// Observable의 method를 상속받아 사용하기 때문에 override 필요없음
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	@Override
	public void removeObserver(Observer o) {
		int i= observers.indexOf(o);
		if(i>=0) observers.remove(i);
		
	}
	@Override
	public void notifyObservers() {
		for(int i=0; i<observers.size() ; i++) {
			Observer observer = observers.get(i);
			observer.update(temperature, humidity, pressure);
		}		
	}
	
	public void measurementChanged() {
		notifyObservers();
	}
	
	// 날씨 정보가 계속 변하는 환경 세팅
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
	}	
	
}
