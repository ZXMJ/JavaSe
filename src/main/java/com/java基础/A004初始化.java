package com.java基础;
public class A004初始化 {
	public static void main(String[] args) {
		A004初始化 a004=new A004初始化();
		//损失精度调用编译出错
		//a004.prints(5d);
		//如果不能匹配到方法，它先会自动转化，自动转化可以匹配到方法，就会调用那个方法
		a004.prints('c');
		//如果能匹配到方法，直接调用
		a004.prints((short)5);
		
	}
	public void prints(short s){
		System.out.println("s"+s);
	}
	
	public void prints(int i){
		System.out.println("i"+i);
	}
	
	public void prints(long l){
		System.out.println("l"+l);
	}
}
