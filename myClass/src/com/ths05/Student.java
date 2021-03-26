package com.ths05;
/*
    private封装student类

    使用Debug查看内存变化流程，this的方向
 */
public class Student {
    private String name;
    private int age;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void show(){
        //private封装的成员变量本类中可以使用
        System.out.println(name+","+age);
    }
}
