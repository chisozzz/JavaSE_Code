package com.ths05;
/*
    方式2：实现Runnable接口
    定义一个类MyRunnable实现Runnable接口
    在MyRunnable类中重写run()方法
    创建MyRunnable类的对象
    创建Thread类的对象，把MyRunnable对象作为构造方法的参数
    启动线程

 */
public class RunnableDemo {
    public static void main(String[] args) {
        Runnabletest rb=new Runnabletest();
//        Thread t1=new Thread(rb);
//        Thread t2=new Thread(rb);
        Thread t1 =new Thread(rb,"高铁");
        Thread t2 =new Thread(rb,"飞机");

        t1.start();
        t2.start();
    }
}
