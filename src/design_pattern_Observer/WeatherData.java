package design_pattern_Observer;

import java.util.ArrayList;

public class weatherdata implements Subject {
	private ArrayList observers; //　옵저버　객체들을　저장하기　위해　배열로　저장하기　위한　선
	private float temperature; //
	private float humidity;
	private float pressure;
	
	public weathredata() {
		observers = new ArrayList();	//　배열로　지정
	}
	
	public void registerObserver(Observer o) { //　옵저버가　등록을　하면　목록　맨　뒤에　추가　하기만하면　됨
		observers.add(o);
	}
	public void removeObserver(Observer o) { //　마찬가지로　옵저버가　탈퇴를　신청하면　목록에서　빼기만　하면　됨
		int i = observers.indexOf(o);
		if (i>= 0) {
			observers.remove(i);
		}
	}
	
	public void notifyObjservers() { //　상태에　대해서　옵저버에게　알려주는　부분
		for (int i = 0; i< observers.size(); i++) { //　　　
			Observer observer = (Observer)observers.get(i); //
			observer.update(temperature, humidity, pressure); //　　업데이트　메소드가　있는　부분으로　여기의　핵심
　			
		}
	}
	
	public void measurementsChamged() { //　기상스테이션으로부터　갱신된　측정치를　받으면　옵저버들한테　알림
		notifyObservers();
	}
	
	public void setMeasurements(float temperature,float humidity, float pressure) { //　기
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
		
	}

}
