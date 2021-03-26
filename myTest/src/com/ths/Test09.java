package com.ths;

import java.util.Scanner;

/*
    案例：评委打分
    需求：在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
          选手的最后得分为：去掉一个最高分和一个最低分后 的4个评委平均值 (不考虑小数部分)。

 */
public class Test09 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int x = 1; x <= arr.length; x++) {
            System.out.println("请输入第" + x + "个评委的分数");
            arr[x - 1] = sc.nextInt();
        }
        int max = getMax(arr);
        int min = getMin(arr);
        int sum = getSum(arr);
        int averg = (sum - max - min) / (arr.length - 2);
        System.out.println("averge:" + averg);
    }

    //数组求和
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //最大值
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int x = 1; x < arr.length; x++) {
            if (arr[x] > max) {
                max = arr[x];
            }
        }
        return max;
    }

    //最小值
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int x = 1; x < arr.length; x++) {
            if (arr[x] < min) {
                min = arr[x];
            }
        }
        return min;
    }
}
