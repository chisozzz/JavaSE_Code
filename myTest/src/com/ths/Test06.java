package com.ths;
/*
    案例：数组内容相同
    需求：设计一个方法，用于比较两个数组的内容是否相同
    数组长度和数组元素相同
 */
public class Test06 {
    public static void main(String[] args) {
        int[]arr ={11,22,33,44,55};
        int[]arr2={11,22,33,44,55};
        boolean flag=compare(arr,arr2);
        System.out.println(flag);

    }
    public static boolean compare(int[]arr,int[]arr2){
        if(arr.length != arr2.length){
            return false;
        }
        for (int x=0;x<arr.length;x++){
            if (arr[x]!=arr2[x]){
                return false;
            }
        }
        return true;
    }
}
