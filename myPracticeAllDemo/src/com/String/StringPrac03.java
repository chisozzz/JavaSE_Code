package com.String;

import java.util.Scanner;

//需求：定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制台输出结果
//例如，键盘录入 abc，输出结果 cba
public class StringPrac03 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();
        System.out.println(printReverse(line));
    }

    private static String printReverse(String line) {
        String s="";
        for (int i=line.length()-1;i>=0;i--){
            char ch = line.charAt(i);
            s+=ch;
        }
        return s;
    }
}
