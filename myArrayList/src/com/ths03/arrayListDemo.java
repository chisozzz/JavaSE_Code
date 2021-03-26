package com.ths03;

import java.util.ArrayList;

/*
    案例：存储学生对象并遍历
    需求：创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合

 */
public class arrayListDemo {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();
        Student s = new Student("zhangsan", "12");
        Student s1 = new Student("lisi", "14");
        Student s2 = new Student("wangwu", "22");
        array.add(s);
        array.add(s1);
        array.add(s2);
        for (int i=0;i<array.size();i++){
            array.get(i).show();
        }

    }
}
