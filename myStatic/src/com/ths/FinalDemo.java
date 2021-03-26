package com.ths;

public class FinalDemo {
    public static void main(String[] args) {
        //final修饰基本数据类型 成为常量不可改变值
        final int x=10;
//        x=100;
        System.out.println(x);
        //final修饰引用数据类型 地址不变
        final Student s=new Student();
//        s=new Student();创建失败
    }
}
