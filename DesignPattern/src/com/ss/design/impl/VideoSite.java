package com.ss.design.impl;

import java.util.ArrayList;

import com.ss.design.inte.Observer;
import com.ss.design.inte.Subject;

//shipinwangzhanmouhu shixian Subject jiekou
public class VideoSite implements Subject {
	
	//guanchazheliebiao yiji gengxinledeshipinliebiao
	private ArrayList<Observer> userList;
	private ArrayList<String> videos;
	
	public VideoSite(){
		userList=new ArrayList<Observer>();
		videos=new ArrayList<String>();
	}

	public void registerObserver(Observer o) {
		userList.add(o);
	}

	public void removeObserver(Observer o) {
		userList.remove(0);
	}

	public void notifyAllObservers() {
		for(Observer o:userList){
			o.update(this);
		}
	}

	public void addVideos(String video){
		this.videos.add(video);
		notifyAllObservers();
	}
	
	public ArrayList<String> getVideos(){
		return videos;
	}
	
	public String toString(){
		return videos.toString();
	}

}
