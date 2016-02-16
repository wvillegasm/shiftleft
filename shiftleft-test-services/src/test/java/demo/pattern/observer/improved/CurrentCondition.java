package demo.pattern.observer.improved;

public class CurrentCondition implements Observer, DisplayElement {

	private float temp;
	private float humidity;
	private Subject weatherData;

	public CurrentCondition(Subject s) {
		this.weatherData = s;
		this.weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current weather conditions: " + temp + " F degress and " + humidity + " % humidity.");
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		display();
	}

}
