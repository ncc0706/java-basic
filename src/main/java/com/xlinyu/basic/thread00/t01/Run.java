package com.xlinyu.basic.thread00.t01;

public class Run {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
		System.out.println("运行结束");
	}
}

class MyThread extends Thread{
	
	@Override
	public void run() {
		super.run();
		System.out.println("MyThread.");
	}
	
}
