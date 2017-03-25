package com.xlinyu.basic.static0;

public class TestPerson {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Person.eyeNum = 2;
		Person p1 = new Person();
		p1.name = "张三";
		p1.age = 20;
		p1.info();
		
		Person p2 = new Person();
		p2.name = "二郎神";
		p2.age = 23;
		p2.eyeNum = 3;
		p2.info();
		// 由此可以看出static修饰的变量是类变量只有一份
		System.out.println("张三： "+p1.eyeNum);
	}
	
}

class Person{
	String name;
	int age;
	
	static int eyeNum;
	
	public void info(){
		System.out.println("我的名字是：" + name + ", 我今年" + age + "岁了" + ", 我有" + eyeNum + "只眼睛");
	}
}
