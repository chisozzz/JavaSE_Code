package com.ths01;
/*
    方案1：继承Thread类
    定义一个类MyThread继承Thread类
    在MyThread类中重写run()方法
    创建MyThread类的对象
    启动线程

 */
public class ThreadDemo01 {
    public static void main(String[] args) {
        MyThread mt1=new MyThread();
        MyThread mt2=new MyThread();
        mt1.start();
        mt2.start();
    }
}
