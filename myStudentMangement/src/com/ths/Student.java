package com.ths;
/*
    定义学生类
    学生类：
	Student
成员变量：
	学号：sid
	姓名：name
	年龄：age
	居住地：address
构造方法：
	无参构造
	带四个参数的构造
成员方法：
	每个成员变量对应给出get/set方法
Alt+Insert快捷键
    Constructor 构造方法
    setter和getter
 */
public class Student {
    private String sid;
    private String name;
    private String age;
    private String adress;
    //构造方法

    public Student() {
    }
    public Student(String sid, String name, String age, String adress) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.adress = adress;
    }

    //get/set方法


    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
