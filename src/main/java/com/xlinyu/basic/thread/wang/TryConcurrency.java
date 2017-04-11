package com.xlinyu.basic.thread.wang;

public class TryConcurrency {

	public static void main(String[] args) {
		try {
			Thread.sleep(1000 * 300L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
