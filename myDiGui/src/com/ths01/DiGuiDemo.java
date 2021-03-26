package com.ths01;
/*
    使用递归求不死神兔的解决方法
    1 1 2 3 5.。。。

 */
public class DiGuiDemo {
    public static void main(String[] args) {
    //正常方法
        int[]arr=new int[20];
        arr[0]=1;
        arr[1]=1;
        for (int i = 2; i < arr.length; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println(arr[19]);
        System.out.println(f(20));
    }
    //递归方法 将问题分成一个小问题循环 n=n-1 +n-2;
    public static int f(int n){
        if (n==1||n==2){
            return 1;
        }else {
            return f(n-1)+f(n-2);
        }
    }
}
