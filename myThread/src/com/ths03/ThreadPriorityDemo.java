package com.ths03;
/*
    Thread类中设置和获取线程优先级的方法
    public final int getPriority()：返回此线程的优先级
    public final void setPriority(int newPriority)：更改此线程的优先级
    线程默认优先级是5；线程优先级的范围是：1-10
    线程优先级高仅仅表示线程获取的CPU时间片的几率高，但是要在次数比较多，或者多次运行的时候才能看到你想要的效果

 */
public class ThreadPriorityDemo {
    public static void main(String[] args) {
        ThreadPriority tp1=new ThreadPriority();
        ThreadPriority tp2=new ThreadPriority();
        ThreadPriority tp3=new ThreadPriority();

        tp1.setName("高铁");
        tp2.setName("飞机");
        tp3.setName("汽车");

        //public final int getPriority()：返回此线程的优先级
//        System.out.println(tp1.getPriority());//5
//        System.out.println(Thread.MAX_PRIORITY);//10
//        System.out.println(Thread.MIN_PRIORITY);//1
//        System.out.println(Thread.NORM_PRIORITY);//5

        //public final void setPriority(int newPriority)：更改此线程的优先级
        tp1.setPriority(5);
        tp2.setPriority(10);
        tp3.setPriority(1);

        tp1.start();
        tp2.start();
        tp3.start();

    }
}
