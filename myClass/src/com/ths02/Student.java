package com.ths02;
/*
    案例：学生
    需求：首先定义一个学生类，然后定义一个学生测试类，在学生测试类中通过对象完成成员变量和成员方法的使用

    学生类
 */
public class Student {
    //成员变量
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
