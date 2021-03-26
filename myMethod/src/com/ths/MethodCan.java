package com.ths;
/*
    带参数的方法定义和调用
    需求：设计一个方法用于打印两个数中的较大数，数据来自于方法参数

 */
public class MethodCan {
    public static void main(String[] args) {
//        getMax(2,3);
        int a =2,b=3;
        getMax(a,b);
        isEventNumber(8);
    }
    //比较两者大小，打印较大值
    public static void getMax(int a, int b ){
        System.out.println(a>b?a:b);
    }
    public static void isEventNumber(int x){
        if (x %2==0){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
