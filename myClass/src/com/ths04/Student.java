package com.ths04;

public class Student {
    String name;
    int age;

    //成员方法
    public void show() {
        System.out.println(name + "," + age);
    }

    public void study() {
        //局部变量
        int i =0;
        System.out.println("好好学习");
    }

    public void doHomework() {
        System.out.println("多多练习");
    }
}
