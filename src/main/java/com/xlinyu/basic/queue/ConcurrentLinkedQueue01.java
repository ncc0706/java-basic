package com.xlinyu.basic.queue;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueue01 {

	public static void main(String[] args) {
		
		// 高性能无阻塞无界队列
		ConcurrentLinkedQueue<String> strQueue = new ConcurrentLinkedQueue<String>();

		// offer add 在ConcurrentLinkedQueue中没有任何区别
		strQueue.offer("Hello");
		strQueue.offer("World");
		strQueue.add("Java");
		strQueue.add("C++");
		System.out.println(strQueue.size());
		System.out.println(strQueue.poll()); //从头取出元素并删除
		System.out.println(strQueue.size());
	
		System.out.println(strQueue.peek());
		System.out.println(strQueue.size());
	}
}
