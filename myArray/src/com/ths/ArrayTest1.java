package com.ths;
/*
    多个不同数组的动态初始化
 */
public class ArrayTest1 {
    public static void main(String[] args) {
        int [] arr1 = new int[3];
        arr1[0] = 100;
        arr1[2] = 200;

        int [] arr2 = new int[2];
        arr2[1] = 22;
        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println("---------");
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);

    }
}
