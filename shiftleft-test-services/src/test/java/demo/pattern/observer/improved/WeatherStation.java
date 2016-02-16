package demo.pattern.observer.improved;

public class WeatherStation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		weatherData.notifyObservers();

		CurrentCondition condition = new CurrentCondition(weatherData);
		StatisticDisplay statistic = new StatisticDisplay(weatherData);

		// weatherData.notifyObservers();

		weatherData.setMeasurements(60.0f, 20.0f, 0);
		weatherData.setMeasurements(62.0f, 19.0f, 0);
		weatherData.setMeasurements(63.0f, 19.0f, 0);
		weatherData.setMeasurements(64.0f, 18.0f, 0);

		// weatherData.removeObserver(statistic);

		weatherData.setMeasurements(65.0f, 19.0f, 0);
		weatherData.setMeasurements(66.0f, 20.0f, 0);
		weatherData.setMeasurements(67.0f, 21.0f, 0);
		weatherData.setMeasurements(70.0f, 25.0f, 0);
		weatherData.setMeasurements(72.0f, 26.0f, 0);
		weatherData.setMeasurements(77.0f, 30.0f, 0);
		weatherData.setMeasurements(72.0f, 31.0f, 0);
		weatherData.setMeasurements(73.0f, 33.0f, 0);
		weatherData.setMeasurements(70.0f, 35.0f, 0);
		weatherData.setMeasurements(71.0f, 38.0f, 0);
		weatherData.setMeasurements(70.0f, 40.0f, 0);
		weatherData.setMeasurements(67.0f, 50.0f, 0);
		weatherData.setMeasurements(65.0f, 40.0f, 0);

		// weatherData.registerObserver(statistic);

		weatherData.setMeasurements(64.0f, 33.0f, 0);
		weatherData.setMeasurements(63.0f, 31.0f, 0);

		// Averages: 62.666668 F degress and 23.333334 % of humidity.
		// Averages: 67.42105 F degress and 28.842106 % of humidity.
	}

}
