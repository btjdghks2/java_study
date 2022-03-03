package design_pattern_Observer;

import java.util.Observer;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver (Observer o);
	public void notifyObserver();

}

public interface Observer {
	public void update (float temp,float humidity,float pressure);

}

public interface DisplayElement {
	public void display();
	
}
