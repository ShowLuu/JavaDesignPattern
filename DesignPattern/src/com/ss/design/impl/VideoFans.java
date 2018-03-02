package com.ss.design.impl;

import com.ss.design.inte.Observer;
import com.ss.design.inte.Subject;

//实现观察者，即看视频的美剧迷们
public class VideoFans implements Observer {

	private String name;
	
	public VideoFans(String name){
		this.name=name;
	}
	
	@Override
	public void update(Subject s) {
		System.out.println(name+", new videos are available! ");
		//print video list
		System.out.println(s);
	}

}
