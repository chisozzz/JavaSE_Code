package com.api;

import java.util.Scanner;

/*
    案例：统计字符次数
    需求：键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数(不考虑其他字符)

 */
public class CharCount {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

        int bigcount=0,smallcount=0,numcout=0;
        for (int i=0;i<line.length();i++){
            char ch =line.charAt(i);
            if (ch>='a'&&ch<='z'){
                smallcount++;
            }else if(ch>='A'&&ch<='Z'){
                bigcount++;
            }else if(ch>='0'&&ch<='9'){
                numcout++;
            }
        }
        System.out.println("大写字母个数："+bigcount);
        System.out.println("小写字母个数："+smallcount);
        System.out.println("数字个数："+numcout);
    }
}
