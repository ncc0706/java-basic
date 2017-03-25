package com.xlinyu.basic.static0;

public class TestCat {

	public static void main(String[] args) {
		Cat c1 = new Cat("kitty", 2);
		System.out.println(c1);
	}
}

class Cat{
	
	// 实例变量
	String name;
	int age;
	// 使用构造器初始化实例变量
	public Cat(String name, int age){
		System.out.println("构造器初始化");
		this.name = name;
		this.age = age;
	}
	
	{
		System.out.println("执行非静态初始化块");
		weight = 2.0;
	}
	// 赋值 与上面的初始化顺序相同
	double weight = 5.9;
	
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", weight=" + weight
				+ "]";
	}
	
}
