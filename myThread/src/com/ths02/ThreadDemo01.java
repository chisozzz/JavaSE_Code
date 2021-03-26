package com.ths02;

/*
    Thread类中设置和获取线程名称的方法
    void setName(String name)：将此线程的名称更改为等于参数 name
    String getName()：返回此线程的名称
    通过构造方法也可以设置线程名称

    如何获取main()方法所在的线程名称?
    public static Thread currentThread()：返回对当前正在执行的线程对象的引用


 */
public class ThreadDemo01 {
    public static void main(String[] args) {
        //void setName(String name)：将此线程的名称更改为等于参数 name
//        MyThread mt1=new MyThread();
//        MyThread mt2=new MyThread();
//        mt1.setName("高铁");
//        mt2.setName("飞机");

        //通过构造方法也可以设置线程名称
        MyThread mt1=new MyThread("高铁");
        MyThread mt2=new MyThread("飞机");
        mt1.start();
        mt2.start();

        //public static Thread currentThread()：返回对当前正在执行的线程对象的引用
        String name = Thread.currentThread().getName();
        System.out.println(name);
    }
}
