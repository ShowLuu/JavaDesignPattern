package com.ss.design.impl;

import java.util.ArrayList;

import com.ss.design.inte.Observer;
import com.ss.design.inte.Subject;

//视频网站 实现 Subject 接口
public class VideoSite implements Subject {
	
	//观察者列表 
	private ArrayList<Observer> userList;
	//更新了的视频列表
	private ArrayList<String> videos;
	
	public VideoSite(){
		userList=new ArrayList<Observer>();
		videos=new ArrayList<String>();
	}

	public void registerObserver(Observer o) {
		userList.add(o);
	}

	public void removeObserver(Observer o) {
		userList.remove(o);
	}

	public void notifyAllObservers() {
//		VideoSite v=new VideoSite();
//		v.videos=videos;
//		o.update(v);
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
