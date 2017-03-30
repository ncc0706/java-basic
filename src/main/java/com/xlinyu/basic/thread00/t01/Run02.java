package com.xlinyu.basic.thread00.t01;

public class Run02 {

	public static void main(String[] args) {
		MyThread mt = null;
		for (int i = 0; i < 10; i++) {
			mt = new MyThread(i+1);
			mt.start();
		}
		
	}
	
	static class MyThread extends Thread{
		private int i;
		
		public MyThread(int i){
			this.i = i;
		}
		
		@Override
		public void run() {
			System.out.println(i);
		}
	}
	
}


