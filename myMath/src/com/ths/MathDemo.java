package com.ths;
/*
    测试Math类的常用方法
 */
public class MathDemo {
    public static void main(String[] args) {
        //abs 返回参数的绝对值
        System.out.println(Math.abs(88));
        System.out.println(Math.abs(-88));
        System.out.println("--------");
        //ceil 返回大于或等于参数的最大整数
        System.out.println(Math.ceil(12.23));
        System.out.println(Math.ceil(12.56));
        System.out.println("--------");
        //floor
        System.out.println(Math.floor(12.23));
        System.out.println(Math.floor(12.56));
        System.out.println("--------");
        //round
        System.out.println(Math.round(12.23F));
        System.out.println(Math.round(12.56F));
        System.out.println("--------");
        //max
        System.out.println(Math.max(23,12));
        System.out.println("--------");
        //min
        System.out.println(Math.min(2,4));
        System.out.println("--------");

        //random

        System.out.println((int)(Math.random()*100)+1);


    }
}
