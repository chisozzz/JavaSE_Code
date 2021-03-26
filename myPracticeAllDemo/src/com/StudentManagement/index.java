package com.StudentManagement;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class index {
    public static void main(String[] args) throws Exception {
        ArrayList<Student>array=new ArrayList<>();
        while (true){
            System.out.println("---------欢迎来到学生管理系统---------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择：");
            Scanner sc=new Scanner(System.in);
            int x = sc.nextInt();
            switch(x){
                case 1:
                    addStudent(array);
                    break;
                case 2:
                    delStudent(array);
                    break;
                case 3:
                    upStudent(array);
                    break;
                case 4:
                    selectAll(array);
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }

    }

    private static void selectAll(ArrayList<Student>array) {
        for (Student s:array){
            System.out.println(s);
        }
    }

    private static void upStudent(ArrayList<Student>array)throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要修改学生的学号：");
        int sid = sc.nextInt();
        for (Student s:array){
            if (sid==s.getSid()){
                array.remove(s);
                addStudent(array);
            }
        }
    }

    private static void delStudent(ArrayList<Student>array) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要删除学生的学号：");
        int sid = sc.nextInt();
        for (Student s:array){
            if (s.getSid()==sid){
                array.remove(s);
            }
        }
        System.out.println("删除成功");
    }

    private static void addStudent(ArrayList<Student>array) throws IOException {
        Student s = new Student();
        Scanner scInt=new Scanner(System.in);
        System.out.println("请输入学生的学号：");
        int sid = scInt.nextInt();
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入学生的姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生的年龄：");
        int age = scInt.nextInt();
        System.out.println("请输入学生的居住地：");
        String address = sc.nextLine();
        s.setSid(sid);
        s.setName(name);
        s.setAddress(address);
        s.setAge(age);
        array.add(s);
        System.out.println("学生添加成功");
    }
}
