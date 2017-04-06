package com.xlinyu.basic.thread00.t01;

public class Run08 {

	// 优先级高的跑的快
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		try {
			ThreadA ta = new ThreadA();
			ThreadB tb = new ThreadB();
			
			ta.setPriority(Thread.NORM_PRIORITY - 3);
			ta.start();
			
			tb.setPriority(Thread.NORM_PRIORITY + 3);
			tb.start();
			
			Thread.sleep(2000);
			ta.stop();
			tb.stop();
			System.out.println("a=" + ta.getCount());
			System.out.println("b=" + tb.getCount());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	static class ThreadA extends Thread {

		private int count = 0;

		public int getCount() {
			return count;
		}

		@Override
		public void run() {
			while(true){
				count++;
			}
		}

	}

	static class ThreadB extends Thread {
		
		private int count = 0;

		public int getCount() {
			return count;
		}
		
		@Override
		public void run() {
			while(true){
				count++;
			}
		}
	}

}
