package com.ArrayList;

import java.util.ArrayList;

//需求：创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
public class Practice02 {
    public static void main(String[] args) {
        ArrayList<Student>array=new ArrayList<>();
        Student s1=new Student("zhangsan",22,"xi`an");
        Student s2=new Student("zhangwei",24,"wuhan");
        Student s3=new Student("wangming",25,"nanchang");
        array.add(s1);
        array.add(s2);
        array.add(s3);
        for (Student s:array){
            System.out.println(s);
        }
    }
}
