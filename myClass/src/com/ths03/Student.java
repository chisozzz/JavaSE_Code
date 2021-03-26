package com.ths03;
/*
    单个对象的对象内存图
 */
public class Student {
    String name;
    int age;

    //成员方法
    public void show(){
        System.out.println(name +","+ age);
    }
    public void study(){
        System.out.println("好好学习");
    }
    public void doHomework(){
        System.out.println("多多练习");
    }
}
