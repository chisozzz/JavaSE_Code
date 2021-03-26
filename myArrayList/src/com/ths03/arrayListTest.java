package com.ths03;

import java.util.ArrayList;
import java.util.Scanner;

/*
    案例：存储学生对象并遍历
    需求：创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
          学生的姓名和年龄来自于键盘录入

 */
public class arrayListTest {
    public static void main(String[] args) {
        ArrayList<Student>array=new ArrayList<>();
        getArray(array);
        getArray(array);
        getArray(array);
        for (int i =0;i<array.size();i++){
            array.get(i).show();
        }


    }
    public static void getArray(ArrayList<Student> array){
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String s = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String s1 = sc.nextLine();

        Student stu =new Student(s,s1);

        array.add(stu);
    }


}
