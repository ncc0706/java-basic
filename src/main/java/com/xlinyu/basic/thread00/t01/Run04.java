package com.xlinyu.basic.thread00.t01;

public class Run04 {

	public static void main(String[] args) {
		// 此时变量不共享
		MyThread t1 = new MyThread("A");
		MyThread t2 = new MyThread("B");
		MyThread t3 = new MyThread("C");
		t1.start();
		t2.start();
		t3.start();
	}
	
	static class MyThread extends Thread {
		
		private int count = 5;
		
		public MyThread(String name) {
			// 设置线程名称
			this.setName(name);
		}
		
		@Override
		public void run() {
			while(count > 0){
				System.out.println("由 " + this.getName() + " 计算, count=" + count);
				count--;
			}
		}
	}
	
}
