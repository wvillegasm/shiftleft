package demo.pattern.observer;

public class ComputerDevice implements Observer, DisplayElement {

	private SubjectStation subject;
	private WeatherData data;

	public ComputerDevice(SubjectStation subject) {
		this.subject = subject;
		this.subject.suscribe(this);
	}

	@Override
	public void update(WeatherData data) {
		this.data = data;
		display();
	}

	@Override
	public void display() {

		System.out.println("Displaying in Computer display");
		System.out.println("Temperature: " + data.getTemperature());
		System.out.println("Humidity: " + data.getHumidity());
		System.out.println("Barometric: " + data.getBarometric());

	}

}
