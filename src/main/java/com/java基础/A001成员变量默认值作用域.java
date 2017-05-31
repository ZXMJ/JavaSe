package com.java基础;

public class A001成员变量默认值作用域 {

	/**
	 * <p>Title: main</p>
	 * <p>Description:基本数据类型的变量的生命周期是由它的作用域决定的，它的生命周期可以确定，它存放在堆栈中
	 * 对象引用的生命周期也是由它的作用域决定的，它的生命周期也可以确定，它也存放在堆栈中，但是java对象的生命周期
	 * 并不是由它的作用域决定的，当不再有引用指向一个对象时，这个对象就成为了一个垃圾，会在垃圾回收器执行时，被清理，
	 * 对象的生命周期并不确定，它存放在堆中。
	 * </p>
	 * <p>Company: </p> 
	 * @author 范保申
	 * @date 2016-4-26
	 */
	//基本数据类型
	boolean b;
	char c;
	byte by;
	short s;
	int i;
	long l;
	float f;
	double d;
	//对象类型String
	String str;
	public static void main(String[] args) {
		A001成员变量默认值作用域 demo=new A001成员变量默认值作用域();
		//boolean默认false
		System.out.println(demo.b);
		//char默认
		System.out.println(demo.c);
		//byte默认0(byte)
		System.out.println(demo.by);
		//short默认0(short)
		System.out.println(demo.s);
		//int默认0
		System.out.println(demo.i);
		//long默认0L
		System.out.println(demo.l);
		//float默认0.0f
		System.out.println(demo.f);
		//double默认0.0d
		System.out.println(demo.d);
		//对象默认null
		System.out.println(demo.str);
	}
	//局部变量必须在赋值之后才能调用，没有初始化默认值
	public void myPrint(){
		int i = 0;
		String s = null;
		System.out.println(i);
		System.out.println(s);
	}

}
