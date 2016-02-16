package demo.pattern.observer;

public interface WeatherData {
	float getTemperature();
	float getHumidity();
	float getBarometric();
	void setTemperature(float t);
	void setHumidity(float h);
	void setBarometric(float b);
}
