package com.xlinyu.basic.thread;

public class Thread02 extends Thread {

	@Override
	public void run() {
		System.out.println("extends Thread Class");
	}
	
	public static void main(String[] args) {
		new Thread02().start();
		System.out.println("---------");
	}
	
}
