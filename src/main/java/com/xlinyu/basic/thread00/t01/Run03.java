package com.xlinyu.basic.thread00.t01;

public class Run03 implements Runnable {

	@Override
	public void run() {
		System.out.println("Runnable 运行...");
	}
	
	public static void main(String[] args) {
		Thread t = new Thread(new Run03());
		t.start();
		System.out.println("运行结束...");
	}

}
