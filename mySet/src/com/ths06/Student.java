package com.ths06;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    @Override
    public int compareTo(Student s) {
        //上下比较，0就重复，整数就是顺序，负数就是逆序
        //返回1就是顺序存入
//        return 1;
        //返回0就是重复，不存入
//        return 0;
        //返回-1就是逆序存入
//        return -1;

        //实现年龄从小到大排列 年龄相同则按照名字的字母排序
        int num=this.age-s.age;
        int num2=num==0?this.name.compareTo(s.name):num;
        return num2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
