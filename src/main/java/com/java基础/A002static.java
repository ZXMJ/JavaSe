package com.java基础;

import java.util.Date;

public class A002static {
	/**
	 * static 修饰的变量，只有一份，它的所有对象操作的都是同一份，数据共享，创建方式会被改变
	 * 
	 * static 修饰的方法，差别不大，一个重要用法是可以不创建对象的前提下调用它。
	 */
	static int i;
	public static void main(String[] args) {
			System.out.println(args.length);
		A002static a1=new A002static();
		A002static a2=new A002static();
		a1.i=10;
		System.out.println(a2.i);
		a2.i=100;
		System.out.println(a1.i);
		a1.myMain();
		System.out.println(new Date());
	}
	public void myMain(){
		System.out.println("Hello World!");
	}

}
