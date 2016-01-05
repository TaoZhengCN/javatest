package com.tz.gof.Observer.custom;

public interface ISubject {
	public void registerObserver(IObserver o);

	public void removeObserver(IObserver o);

	public void notifyObserver();
}
