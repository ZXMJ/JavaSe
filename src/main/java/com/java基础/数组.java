package com.java基础;

import java.util.Arrays;

public class 数组 {
	
	public static void main(String args[]){
		//数组定义
			//(方法1)定义并初始化
			int[] a={1,2,3,4,5};
			//(方法2)匿名数组:可以在不创建新变量的情况下重新初始化一个数组，即把一个数组类型的引用指向一个新的数组对象
			a=new int[]{1,2,3,4};
			//(方法3)
		//数组copy
			//(方法1)直接把数组a赋值给b,结果是两个变量将引用用同一个变量
			int[] b=a;
			//测试a，b为同一个数组
			/*b[3]=5;
			for(int i:a){
				System.out.println(i);
			}*/
			//(方法2)使用Arrays类的copyOf()方法，第二个参数是新数组的长度，这个方法常用来增加数组的大小。
			//如果数组元素是数值型，那么多余的元素将被赋值为0，如果是布尔型将被赋值为false。相反，如果长度小于原始长度，则只复制最前面的数据元素
			int[] b2=Arrays.copyOf(a,a.length*2);
			//测试如果数组元素是数值型，那么多余的元素将被赋值为0，包括局部变量
			System.out.println(b2[5]);
	}
}
