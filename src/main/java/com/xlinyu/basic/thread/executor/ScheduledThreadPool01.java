package com.xlinyu.basic.thread.executor;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool01 {

	public static void main(String[] args) {
		
		final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		// 创建一个定长线程池，支持定时及周期性任务执行
		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(15);
		scheduledThreadPool.scheduleAtFixedRate(new Runnable() {
			public void run() {
				System.out.println(sdf.format(new Date()) + " -> delay 3 seconds");
			}
		}, 1, 3, TimeUnit.SECONDS);
		System.out.println(sdf.format(new Date()));
	}

}
