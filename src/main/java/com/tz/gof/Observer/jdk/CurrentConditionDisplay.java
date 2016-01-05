package com.tz.gof.Observer.jdk;

import java.util.Observer;
import java.util.Observable;

public class CurrentConditionDisplay implements Observer, IDisplayElement {
	private float temperature;
	private float humidity;
	//private Observable weatherData;

	public CurrentConditionDisplay(Observable weatherData) {
		//this.weatherData = weatherData;
		weatherData.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current Conditions:" + temperature + "F degrees and " + humidity + "%humidity");
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData)
		{
			WeatherData wd = (WeatherData)o;
			this.temperature = wd.getTemperature();
			this.humidity = wd.getHumidity();
			display();
		}
	}

}
