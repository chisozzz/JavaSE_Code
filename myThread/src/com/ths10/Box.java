package com.ths10;

/*
    奶箱类(Box)：定义一个成员变量，表示第x瓶奶，提供存储牛奶和获取牛奶的操作
 */
public class Box {
    private int milk;
    private boolean state = false;

    //定义一个成员变量表示奶箱的状态 true有奶
    public synchronized void store(int milk) {
        if (state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.milk = milk;
        System.out.println("送奶工存储了第" + milk + "瓶奶");
        state=true;

        notifyAll();
    }

    public synchronized void get() {
        if (!state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("用户拿到了第" + this.milk + "奶");
        state=false;
        notifyAll();
    }
}
