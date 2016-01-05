package com.tz.gof.Observer.jdk;

public class Program {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay ccd  = new CurrentConditionDisplay(weatherData);
		//这个系统自带的自带的Observer类 里面的updatE通知是有顺序的，产生了顺序的依赖性，用的时候要注意，最好自己定义Observer
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);

	}

}
