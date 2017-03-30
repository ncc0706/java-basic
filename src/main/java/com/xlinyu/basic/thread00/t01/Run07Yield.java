package com.xlinyu.basic.thread00.t01;

public class Run07Yield {

	public static void main(String[] args) {
		new MyThread().start();
	}
	
	static class MyThread extends Thread {
	
		
		@Override
		public void run() {
			long beginTime = System.currentTimeMillis();
			int count = 0;
			for (int i = 0; i < 50000000; i++) {
//				Thread.yield();
				count = count + (i + 1);
			}
			long enTime = System.currentTimeMillis();
			System.out.println("用时: " + (enTime - beginTime) + " 毫秒");
		}
		
	}
	
}
