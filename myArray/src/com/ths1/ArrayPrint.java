package com.ths1;

/*
    遍历的通用语句

    实用程序得出数组元素中的最大值和最小值
 */
public class ArrayPrint {
    public static void main(String[] args) {
        int[] arr = {11, 222, 44, 24, 14};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //最大值
        System.out.println("------------");
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);

        //最小值
        System.out.println("------------");
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
