package com.String;

import java.util.Scanner;

//需求：键盘录入一个字符串，使用程序实现在控制台遍历该字符串
public class StringTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();
        for (int i = 0; i <line.length(); i++) {
            char ch = line.charAt(i);
            System.out.println(ch);
        }

    }
}
