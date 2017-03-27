package com.xlinyu.basic.thread.executor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FixedThreadPool01 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		int taskSize = 50; 
		// 创建一个固定大小的线程池
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(taskSize);
		// 创建多个有返回值的任务
		List<Future> list = new ArrayList<Future>();
		for (int i = 0; i < taskSize; i++) {
			Callable c = new MyCallable(i + " ");
			Future f = fixedThreadPool.submit(c);
			list.add(f);
		}
		
		// 关闭线程池
		fixedThreadPool.shutdown();
		
		// 获取所有并发任务的运行结果
		for (Future f : list) {
			System.out.println(">>>" + f.get().toString());
		}
	}
	
}

class MyCallable implements Callable<Object>{

	private String taskNum;
	
	public MyCallable(String taskNum) {
		this.taskNum = taskNum;
	}
	
	@Override
	public Object call() throws Exception {
		System.out.println(">>>" + taskNum + "任务启动");
		Date dateTmp1 = new Date();  
		Thread.sleep(3000);  
		Date dateTmp2 = new Date();  
		long time = dateTmp2.getTime() - dateTmp1.getTime();  
		System.out.println(">>>" + taskNum + "任务终止");  
		return taskNum + "任务返回运行结果,当前任务时间【" + time + "毫秒】";
	}
	
}
