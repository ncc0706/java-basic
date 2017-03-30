package com.xlinyu.basic.thread00.t01;


public class Run05 {
	
	public static void main(String[] args) {
		
		//此时变量就共享了,但是存在线程安全问题
		MyThread mt = new MyThread();
		Thread t1 = new Thread(mt, "A");
		Thread t2 = new Thread(mt, "B");
		Thread t3 = new Thread(mt, "C");
		Thread t4 = new Thread(mt, "D");
		Thread t5 = new Thread(mt, "E");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
	
	static class MyThread extends Thread {
		
		private int count = 5;
		
		@Override
		public synchronized void run() {
			System.out.println("由 " + currentThread().getName()+ " 计算, count=" + count);
			count--;
		}
	}
}
