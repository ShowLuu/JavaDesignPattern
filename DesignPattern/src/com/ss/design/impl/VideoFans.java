package com.ss.design.impl;

import com.ss.design.inte.Observer;
import com.ss.design.inte.Subject;

//shixianguanchazhe,jikanshipindemeijumimen
public class VideoFans implements Observer {

	private String name;
	
	public VideoFans(String name){
		this.name=name;
	}
	
	@Override
	public void update(Subject s) {
		System.out.println(this.name+", new videos are available! ");
		//print video list
		System.out.println(s);
	}

}
