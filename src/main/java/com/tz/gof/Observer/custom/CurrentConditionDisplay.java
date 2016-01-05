package com.tz.gof.Observer.custom;

public class CurrentConditionDisplay implements IObserver, IDisplayElement {
	private float temperature;
	private float humidity;
	private ISubject weatherData;

	public CurrentConditionDisplay(ISubject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current Conditions:" + temperature + "F degrees and " + humidity + "%humidity");
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

}
