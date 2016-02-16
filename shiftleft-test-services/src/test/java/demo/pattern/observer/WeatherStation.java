package demo.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements SubjectStation {

	private List<Observer> observers;
	private WeatherData info;

	public WeatherStation() {
		observers = new ArrayList<Observer>();
		this.setInfo(new WeatherInfo());
	}

	public WeatherStation(WeatherInfo info, List<Observer> o) {
		super();
		this.observers = o;
		this.setInfo(info);
	}

	@Override
	public void suscribe(Observer o) {
		observers.add(o);
	}

	@Override
	public void unsuscribe(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update(info);
		}
	}

	public WeatherData getInfo() {
		return info;
	}

	public void setInfo(WeatherInfo info) {
		this.info = info;
		notifyObservers();
	}

}
