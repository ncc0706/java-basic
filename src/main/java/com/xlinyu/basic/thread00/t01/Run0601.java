package com.xlinyu.basic.thread00.t01;

public class Run0601 {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
//		mt.start();
		mt.run();
	}
	
	static class MyThread extends Thread{
		
		public MyThread(){
			System.out.println("cons 方法打印: " + Thread.currentThread().getName());
		}
		
		@Override
		public void run() {
			System.out.println("run 方法打印: " + Thread.currentThread().getName());
		}
	}
	
}
