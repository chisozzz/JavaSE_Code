package com.ths;

import java.util.Scanner;

public class DebugPractic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("第一个数字：");
        int a = sc.nextInt();
        System.out.println("第二个数字：");
        int b = sc.nextInt();
        int max=getMax(a,b);
        System.out.println(max);
//        System.out.println(getMax(a,b));
    }

    public static int getMax(int a,int b){
        //使用三元运算符,句式很简单但是程序的流程非常复杂
        if (a>b){
            return a;
        }else {
            return b;
        }

    }
}
