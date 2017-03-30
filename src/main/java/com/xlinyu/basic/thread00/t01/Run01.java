package com.xlinyu.basic.thread00.t01;

public class Run01 {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.setName("MyThread");
		myThread.start();
		
		try {
			for (int i = 0; i < 10; i++) {
				int time = (int)(Math.random() * 1000);
				Thread.sleep(time);
				System.out.println("main=" + Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	
	static class MyThread extends Thread{
		@Override
		public void run() {
			try {
				for (int i = 0; i < 10; i++) {
					int time = (int)(Math.random() * 1000);
					Thread.sleep(time);
					System.out.println("run=" + Thread.currentThread().getName());
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
}

