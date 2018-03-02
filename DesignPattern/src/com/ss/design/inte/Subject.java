package com.ss.design.inte;

//Subject zhutijiekou
public interface Subject {
	
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyAllObservers();

}
