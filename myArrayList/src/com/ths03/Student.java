package com.ths03;

/*
    案例：存储学生对象并遍历
    需求：创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合

 */
public class Student {
    private String name;
    private String age;

    public Student() {
    }

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + "," + age);
    }
}
