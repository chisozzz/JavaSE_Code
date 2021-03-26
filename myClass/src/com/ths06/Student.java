package com.ths06;
/*
    联系构造方法
    构造标准类
 */
public class Student {
    private String name ;
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
    //构造空对象
    public Student(){}

    //构造一个带有name的对象
    public Student(String name){
        this.name=name;
    }
    //构造一个age的对象
    public Student(int age){
        this.age=age;
    }
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void show(){
        System.out.println(name+","+age);
    }

}
