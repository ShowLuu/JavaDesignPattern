package com.ss.design.test;

import com.ss.design.impl.VideoFans;
import com.ss.design.impl.VideoSite;

public class ObserverTest {
	
	public static void main(String[] args) {
		
		VideoSite vs=new VideoSite();
		vs.registerObserver(new VideoFans("LiLei"));
		vs.registerObserver(new VideoFans("HanMeimei"));
		
		vs.addVideos("Video 1");
		System.out.println("------");
		vs.registerObserver(new VideoFans("XiaoMing"));
		vs.addVideos("video 2");
		
	}

}
