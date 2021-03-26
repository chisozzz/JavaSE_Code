package com.api;

import java.util.Random;
import java.util.Scanner;

/*
    API 使用练习
        需求：按照帮助文档的使用步骤学习 Scanner 类的使用，并实现键盘录入一个字符串，最后输出在控制台

 */
public class RandomDemo {
    public static void main(String[] args) {

        Random r= new Random();
        int number = r.nextInt(10);
        System.out.println(number);
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个字符串；");
        //Ctrl+Alt+V需要方法有返回值
        String line = sc.nextLine();
        System.out.println(line);
    }
}
