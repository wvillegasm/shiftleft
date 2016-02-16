package demo.pattern.observer.improved;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

	private List<Observer> observers;
	private float temp;
	private float humidity;
	private float pressure;

	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		this.observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		this.observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update(temp, humidity, pressure);
		}
	}

	public void setMeasurements(float t, float h, float p) {
		this.temp = t;
		this.humidity = h;
		this.pressure = p;
		measurementsChanged();
	}

	public void measurementsChanged() {
		notifyObservers();
	}

}
