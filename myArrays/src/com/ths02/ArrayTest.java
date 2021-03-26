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
    }
}
