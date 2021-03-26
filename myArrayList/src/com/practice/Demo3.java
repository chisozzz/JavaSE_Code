package com.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<Studnet> array=new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            Scanner sc=new Scanner(System.in);
            Studnet s=new Studnet();
            System.out.println("请输入姓名：");
            String name = sc.nextLine();
            System.out.println("请输入年龄：");
            Integer age = sc.nextInt();
            s.setName(name);
            s.setAge(age);
            array.add(s);
        }
        for (Studnet studnet : array) {
            System.out.println(studnet.getName()+","+studnet.getAge());
        }
    }
}
