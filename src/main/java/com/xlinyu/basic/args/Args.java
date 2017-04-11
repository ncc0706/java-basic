package com.xlinyu.basic.args;

public class Args {

	public static void main(String[] args) {
//		sum(new int[]{1, 2, 3, 4, 5});
		
		fun("C", "C++", "Java", "Python");
	}
	
	public static void sum(int... nums){
		int sum = 0;
		for(int i=0;i<nums.length;i++){
			sum += nums[i];
		}
		System.out.println("sum: " + sum);
	}
	/**
	 * 可变参数
	 * @param strs
	 */
	public static void fun(String... strs){
		for(int i=0;i<strs.length;i++){
			System.out.println(strs[i]);
		}
	}
	
}
