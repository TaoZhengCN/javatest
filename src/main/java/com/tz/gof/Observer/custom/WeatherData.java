package com.tz.gof.Observer.custom;

import java.util.ArrayList;

public class WeatherData implements ISubject {
	private ArrayList<IObserver> observers;
	private float temperature;

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

	private float humidity;
	private float pressure;

	public WeatherData() {
		observers = new ArrayList<IObserver>();
	}

	@Override
	public void registerObserver(IObserver o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(IObserver o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObserver() {
		observers.forEach(x -> x.update(temperature, humidity, pressure));
	}

	public void measurementsChanges() {
		notifyObserver();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanges();
	}

}
