package com.java基础;

public class String探究 {
    // String创建的对象不可变，编译器让String字符串常量共享。而+或subString等操作结果是不共享的
    public static void main(String args[]) {
        // equalsIgnoreCase比较内容不区分字符串大小写
        boolean b = "Hello".equalsIgnoreCase("hello");
        System.out.println(b);
    }

}
