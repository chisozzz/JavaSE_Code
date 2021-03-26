package com.ths;
/*
    案例：获取数组最大值
    需求：设计一个方法用于获取数组中元素的最大值

 */
public class MethodArrayMax {
    public static void main(String[] args) {
        int[]arr = {11,12,22,44,13};

        System.out.println(getMax(arr));
        System.out.println(getMin(arr));
    }
    //最大值
    public static int getMax(int[]arr){
        int max= arr[0];
        for (int i =1;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    //最小值
    public static int getMin(int[]arr){
        int min= arr[0];
        for (int i =1;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
