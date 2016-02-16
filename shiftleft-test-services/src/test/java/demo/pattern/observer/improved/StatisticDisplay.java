package demo.pattern.observer.improved;

public class StatisticDisplay implements Observer, DisplayElement {

	private Subject weatherData;
	private int lectures;
	private float temp;
	private float humidity;

	public StatisticDisplay(Subject s) {
		this.weatherData = s;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		if (lectures == 0) {
			System.out.println("No averages lectures.");
		} else {
			float tempAv = temp / lectures;
			float humAv = humidity / lectures;
			System.out.println("Averages: " + tempAv + " F degress and "
					+ humAv + " % of humidity.");
		}
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		lectures++;
		this.temp += temp;
		this.humidity += humidity;
		display();
	}

}
