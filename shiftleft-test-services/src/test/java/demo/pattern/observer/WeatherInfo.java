package demo.pattern.observer;

public class WeatherInfo implements WeatherData {

	private float temperature;
	private float humidity;
	private float barometric;

	public WeatherInfo() {
		super();
	}

	public WeatherInfo(float temperature, float humidity, float barometric) {
		super();
		this.temperature = temperature;
		this.humidity = humidity;
		this.barometric = barometric;
	}

	@Override
	public float getTemperature() {
		return this.temperature;
	}

	@Override
	public float getHumidity() {
		return this.humidity;
	}

	@Override
	public float getBarometric() {
		return this.barometric;
	}

	@Override
	public void setTemperature(float t) {
		this.temperature = t;
	}

	@Override
	public void setHumidity(float h) {
		this.humidity = h;
	}

	@Override
	public void setBarometric(float b) {
		this.barometric = b;
	}

}
