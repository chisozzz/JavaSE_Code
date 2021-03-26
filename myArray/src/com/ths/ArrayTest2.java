package com.ths;

/*
    多个数组指向数组的操作练习
 */
public class ArrayTest2 {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println("-----------");

        arr2 = arr1;
        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println("-----------");

        arr2[2] = 100;
        arr1[0] = 100;
        System.out.println(arr1[2]);
        System.out.println(arr2[0]);
    }
}
