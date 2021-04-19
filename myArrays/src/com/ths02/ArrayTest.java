package com.ths02;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[]arr={11,2,34,3,23};
        System.out.println(Arrays.toString(arr));
        //排序sort
        Arrays.sort(arr);
        //toString 格式输出
        System.out.println(Arrays.toString(arr));

        int[]arr1={1,2,3,4};
        int[]arr2={1,2,3,4};
        //对arr1和arr2两个数组进行比较，如果每个元素都相等则放回true
        boolean equals = Arrays.equals(arr1, arr2);
        System.out.println(equals);
        System.out.println(Arrays.toString(arr1));
        //将指定值10填充到数组arr1中，结果[1, 2, 3, 4]->[10, 10, 10, 10]
        Arrays.fill(arr1, 10);
        System.out.println(Arrays.toString(arr1));

        //二分查找法，只能对有序的数组进行查找
        int i = Arrays.binarySearch(arr, 2);
        System.out.printf("%d 的索引为%d",2,i);
    }
}
