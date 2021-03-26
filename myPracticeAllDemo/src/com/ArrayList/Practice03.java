package com.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

//需求：创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
//          学生的姓名和年龄来自于键盘录入
public class Practice03 {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();


        System.out.println("请输入录入的学生个数：");
        int num = scanInteger();
//        for (int i = 0; i < num; i++) {
//            Student s1=new Student();
//            Scanner sc=new Scanner(System.in);
//            //Scanner对象只能使用两次，建议使用字符缓冲流，需要重复录入建议使用自定义方法
//            Scanner scAddress=new Scanner(System.in);
//            System.out.println("请输入学生姓名：");
//            String name = sc.nextLine();
//            System.out.println("请输入学生年龄：");
//            int age = sc.nextInt();
//            System.out.println("请输入学生居住地：");
//            String address = scAddress.nextLine();
//            System.out.println("信息录入成功，请继续输入");
//            s1.setName(name);
//            s1.setAdress(address);
//            s1.setAge(age);
//            array.add(s1);
//        }
        for (int i = 0; i < num; i++) {
            Student s1 = new Student();
            System.out.println("请输入学生姓名：");
            String name = scanString();
            System.out.println("请输入学生年龄：");
            int age = scanInteger();
            System.out.println("请输入学生居住地：");
            String address = scanString();
            System.out.println("信息录入成功");
            s1.setName(name);
            s1.setAdress(address);
            s1.setAge(age);
            array.add(s1);
        }
        for (Student s : array) {
            System.out.println(s);
        }
    }

    private static String scanString() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        return s;
    }

    private static int scanInteger() {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        return age;
    }
}
