package com.tz.gof.Observer.jdk;

public class Program {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay ccd  = new CurrentConditionDisplay(weatherData);
		//���ϵͳ�Դ����Դ���Observer�� �����updatE֪ͨ����˳��ģ�������˳��������ԣ��õ�ʱ��Ҫע�⣬����Լ�����Observer
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);

	}

}
