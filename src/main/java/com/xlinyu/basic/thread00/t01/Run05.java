package com.xlinyu.basic.thread00.t01;


public class Run05 {
	
	public static void main(String[] args) {
		
		//此时变量就共享了,但是存在线程安全问题
		MyThread mt = new MyThread();
		Thread t1 = new Thread(mt, "A");
		Thread t2 = new Thread(mt, "B");
		Thread t3 = new Thread(mt, "C");
		
		t1.start();
		t2.start();
		t3.start();
	}
	
	static class MyThread extends Thread {
		
		private int count = 5;
		
		@Override
		public void run() {
			while(count > 0){
				System.out.println("由 " + this.getName() + " 计算, count=" + count);
				count--;
			}
		}
	}
}
