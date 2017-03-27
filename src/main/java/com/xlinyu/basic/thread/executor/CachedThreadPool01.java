package com.xlinyu.basic.thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool01 {

	public static void main(String[] args) {
		// 创建一个可缓存线程池
		ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
		for (int i = 0; i < 10; i++) {
			final int index = i;
			try {
				Thread.sleep(index * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			cachedThreadPool.execute(new Runnable(){

				@Override
				public void run() {
					System.out.println(index);
				}
				
			});
			
		}

	}

}
