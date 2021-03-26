package com.ths04;
/*
    void setDaemon(boolean on) 将此线程标记为 daemon线程或用户线程。
 */
public class ThreadDaemonDemo {
    public static void main(String[] args) {
        ThreadDaemon tp1=new ThreadDaemon();
        ThreadDaemon tp2=new ThreadDaemon();



        tp1.setName("关羽");
        tp2.setName("张飞");
        Thread.currentThread().setName("刘备");

        tp1.setDaemon(true);
        tp2.setDaemon(true);

        tp1.start();
        tp2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }


    }
}
