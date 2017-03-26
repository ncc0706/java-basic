package com.xlinyu.basic.thread;

public class Thread01 implements Runnable {

	@Override
	public synchronized void run() {
		System.out.println("Java Thread");
	}

	public static void main(String[] args) throws InterruptedException {
		new Thread(new Thread01()).start();
		Thread.sleep(1000);
		System.out.println("-------------");
	}
	
}
