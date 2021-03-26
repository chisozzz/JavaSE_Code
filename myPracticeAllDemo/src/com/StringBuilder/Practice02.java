package com.StringBuilder;

import java.util.Scanner;

//需求：定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制台输出结果
//例如，键盘录入abc，输出结果 cba
public class Practice02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串；");
        String line = sc.nextLine();
        StringBuilder sb=new StringBuilder(line);
        sb.reverse();
        System.out.println(sb.toString());
    }
}
