package com.xlinyu.basic.overload;

public class TestOverload {

	public static void main(String[] args) {
	
		MyMath m = new MyMath();
		
		m.add(2, 3);
		m.add(2.1, 3.1);
		m.add(2, 3, 4);
		
	}
}

class MyMath{
	
	public int add(int a, int b){
		return a + b;
	}
	
	public int add(double a, double b){
		return (int) (a + b);
	}
	
	public int add(int a, int b, int c){
		return a + b + c;
	}
}
