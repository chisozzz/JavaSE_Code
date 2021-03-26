package com.ths04;

/*
    static void sleep(long millis) 使当前正在执行的线程停留（暂停执行）指定的毫秒数
 */
public class ThreadSleepDemo {
    public static void main(String[] args) {
        ThreadSleep tp1=new ThreadSleep();
        ThreadSleep tp2=new ThreadSleep();
        ThreadSleep tp3=new ThreadSleep();


        tp1.setName("高铁");
        tp2.setName("飞机");
        tp3.setName("汽车");



        tp1.start();
        tp2.start();
        tp3.start();


    }
}
