package com.ths01;
/*
    练习Integer类的与int的不同，学习Integer类的常用方法
 */
public class IntegerDemo {
    public static void main(String[] args) {
        int ceil=Integer.MAX_VALUE;
        int floor=Integer.MIN_VALUE;
        System.out.println("int的数据范围："+ floor+"~"+ceil);
        System.out.println("--------");
        Integer i1 = Integer.valueOf(100);//实例化
        int i2 = Integer.valueOf("100");
        System.out.println(i1.intValue());
        System.out.println(i2);

        System.out.println("---------");
        String s="22222";

        int i3=Integer.parseInt(s);
//        String s1="abc";
//        int i = Integer.parseInt(s1);NumberFormatException

    }
}
