package com.ths02;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
    案例：二月天
    需求：获取任意一年的二月有多少天

 */
public class Test {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入查看二月的年份：");
        int year = sc.nextInt();
        Calendar c = Calendar.getInstance();
        c.set(year,2,1);
        c.add(Calendar.DATE,-1);
        System.out.println(c.get(Calendar.DATE)+"天");

    }
//public static void main(String[] args) {
//    Calendar c = Calendar.getInstance();
//    Scanner sc=new Scanner(System.in);
//    System.out.println("请输入年份：");
//    int year = sc.nextInt();
//    c.set(year,2,1);
//    c.set(c.DATE,-1);
//    System.out.println(c.get(Calendar.DATE)+"天");
//}
}
