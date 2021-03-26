package com.api;

import java.util.Scanner;

/*
    案例；字符串反转
    需求：定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制台输出结果
例如，键盘录入 abc，输出结果 cba

 */
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();
        String s = reverse(line);
        System.out.println("s:"+s);
    }
    public static String reverse(String line){
        String s="";
        for (int i=line.length()-1;i>=0;i--){
            s+=line.charAt(i);

        }
        return s;
    }
}
