package com.ths04;

/*
    void join() 等待这个线程死亡。
 */
public class ThreadJoinDemo {
    public static void main(String[] args) {
        ThreadJoin tp1=new ThreadJoin();
        ThreadJoin tp2=new ThreadJoin();
        ThreadJoin tp3=new ThreadJoin();


        tp1.setName("皇上");
        tp2.setName("太子");
        tp3.setName("三皇子");



        tp1.start();
        try {
            tp1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tp2.start();
        tp3.start();


    }
}
