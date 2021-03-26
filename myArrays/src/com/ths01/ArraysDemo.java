package com.ths01;
/*
    冒泡排序的实现算法
 */
public class ArraysDemo {
    public static void main(String[] args) {
        int[]arr={12,3,55,32,44};
        arrayToString(arr);
        for (int x=0;x<arr.length-1;x++){
            for (int i=0;i <arr.length-1-x;i++){
                if (arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        arrayToString(arr);
    }
    public static void arrayToString(int []arr){
        StringBuilder sb =new StringBuilder();
        sb.append("[");
        for (int i=0;i<arr.length;i++){
            if (i==arr.length-1){
                sb.append(arr[i]);
            }else {

                sb.append(arr[i]+", ");
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}
