package com.xlinyu.basic.jni;

/**
 * javac HelloNative
 * javah com.xlinyu.basic.jin.HelloNative #生成头文件
 * @author ncc0706
 */
public class HelloNative {

	static{
		System.loadLibrary("HelloNative");
	}
	
	public static native void sayHello();
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		new HelloNative().sayHello();
	}
	
}
