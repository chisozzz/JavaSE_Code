package com.Scanner;

import java.util.Arrays;
import java.util.Scanner;
//import java.util.regex.Pattern;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入创建数组的大小：");
        int length = sc.nextInt();
        int[] arr = new int[length];
//        sc.useDelimiter("\\s");
        System.out.println("请输入数组的值（使用空格分隔）");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
    }
}
