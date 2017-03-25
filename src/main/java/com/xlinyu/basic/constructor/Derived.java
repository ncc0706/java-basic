package com.xlinyu.basic.constructor;

public class Derived extends Base {

	private int i = 22;
	
	public Derived(){
		i = 222;
	}
	
	public void display(){
		System.out.println(i);
	}
	
}
