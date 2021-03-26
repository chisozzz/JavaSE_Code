package com.ths;

import java.security.AlgorithmConstraints;
import java.util.ArrayList;
import java.util.Scanner;

/*
    学生管理系统的实现思路

    定义学生类
    主界面的代码编写
    添加学生的代码编写
    查看学生的代码编写
    删除学生的代码编写
    修改学生的代码编写

 */
public class StudentMangement {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();
        while (true) {
            System.out.println("--------欢迎使用学生管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择：");
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            switch (line) {
                case "1":
//                    System.out.println("添加学生");
                    addStudent(array);
                    break;
                case "2":
//                    System.out.println("删除学生");
                    deleteStudent(array);
                    break;
                case "3":
//                    System.out.println("修改学生");
                    setStudent(array);
                    break;
                case "4":
//                    System.out.println("查看所有学生");
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用");
//                    break;
                    System.exit(0);//JVM退出
                default:
                    System.out.println("无此选项，请重新选择");
            }
        }

    }

    //对学生信息进行重复判断
    public static boolean sameStudent(ArrayList<Student> array, String sid) {
        boolean flag = false;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getSid().equals(sid)) {
                flag = true;
            }
        }
        return flag;
    }

    //添加学生
    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        String sid,name;
        //判断学号是否重复
        while (true) {
            System.out.println("请输入学生学号：");
            sid = sc.nextLine();
            if (sameStudent(array, sid)) {
                System.out.println("你输入的学号已经被占用，请重新输入");
            } else {
                break;
            }

        }
        //判断姓名是否重复
        while (true) {
            System.out.println("请输入学生姓名：");
            name = sc.nextLine();
            if (sameStudent(array, name)) {
                System.out.println("你输入的姓名已经被占用，请重新输入");
            } else {
                break;
            }

        }
//        System.out.println("请输入学生姓名：");
//        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地：");
        String adress = sc.nextLine();
        Student s = new Student(sid, name, age, adress);
        array.add(s);
        System.out.println("添加成功");

    }

    //删除学生
    public static void deleteStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入想要删除学生的学号：");
        String s = sc.nextLine();
        int flag = -1;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getSid().equals(s)) {
                flag = i;

            }
        }
        if (flag == -1) {
            System.out.println("数据库无此学生学号");
        } else {
            array.remove(flag);
            System.out.println("删除成功");
        }
    }

    //修改学生

    public static void setStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        String sid, name, age, adress;
        System.out.println("请输入想要修改学生的学号：");
        String line = sc.nextLine();
        int flag = -1;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getSid().equals(line)) {
                flag = i;
            }
        }
        if (flag == -1) {
            System.out.println("数据库无此学生学号");
        } else {
            System.out.println("请输入新学生的学号：");
            sid = sc.nextLine();
            System.out.println("请输入新学生的姓名：");
            name = sc.nextLine();
            System.out.println("请输入新学生的年龄：");
            age = sc.nextLine();
            System.out.println("请输入新学生的居住地：");
            adress = sc.nextLine();
            Student s = new Student(sid, name, age, adress);
            array.set(flag, s);
            System.out.println("修改成功");
        }

    }

    //查看学生
    public static void findAllStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("数据库无信息，请添加学生信息");
        } else {
            System.out.println("学号\t\t\t姓名\t\t年龄\t\t居住地");
            for (int i = 0; i < array.size(); i++) {
                String sid = array.get(i).getSid();
                String name = array.get(i).getName();
                String age = array.get(i).getAge();
                String adress = array.get(i).getAdress();

                System.out.println(sid + "\t\t" + name + "\t" + age + "\t\t" + adress);
            }
        }
    }
}
