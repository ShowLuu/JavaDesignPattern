package com.ss.design.inte;

//Subject 主题接口
public interface Subject {
	
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyAllObservers();

}
