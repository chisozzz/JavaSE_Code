package com.StringBuilder;
//需求：定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，
// 调用该方法，并在控制台输出结果。例如，数组为int[] arr = {1,2,3}; ，执行方法后的输出结果为：[1, 2, 3]

import java.util.Scanner;

public class StringBuilderPrac01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一组数字(使用逗号分开):");
        String num = sc.nextLine();
        StringBuilder sb=new StringBuilder(num);
        System.out.println("["+sb.toString()+"]");
    }
}
