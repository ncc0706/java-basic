package com.xlinyu.basic.array;

public class Array04 {

	public static void main(String[] args) {
		
		Person[] stus = new Person[2];
		System.out.println(stus.length);
		
		Person p1 = new Person();
		p1.age = 20;
		p1.height = 178;
		
		Person p2 = new Person();
		p2.age = 22;
		p2.height = 198;

		stus[0] = p1;
		stus[1] = p2;
		p2.info();
		stus[1].info();
	}
	
}

class Person{
	
	public int age;
	
	public double height;
	
	public void info(){
		System.out.println("年龄是: " + age + ", 身高是: " + height);
	}
}
