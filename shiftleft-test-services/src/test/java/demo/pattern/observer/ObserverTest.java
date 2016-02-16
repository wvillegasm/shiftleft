package demo.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WeatherInfo data = new WeatherInfo(77.0f, 20.0f, 5.23f);
		SubjectStation stn = new WeatherStation();
		
		

		System.out.println("\n\n------------------");
		
		AndroidDevice android = new AndroidDevice(stn);
		android.update(data);
		
		System.out.println("\n\n------------------");
		ComputerDevice pc = new ComputerDevice(stn);
		pc.update(data);
		//stn.setInfo(data);

		System.out.println("\n\n------------------");
		data.setTemperature(80.7f);
		//stn.setInfo(data);
		
		stn.unsuscribe(android);
		System.out.println("\n\n------------------");
		data.setTemperature(80.7f);
		//stn.setInfo(data);
		
		//stn.unsuscribe();
		//stn.unsuscribe();

	}

}
