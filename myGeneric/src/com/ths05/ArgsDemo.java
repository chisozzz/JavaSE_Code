package com.ths05;

public class ArgsDemo {
    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        System.out.println(sum(10,20,30,40));
        System.out.println(sum(10,20,30,40,50));

    }
    //实现一个多个参数求和的方法，返回求和值
    public static int sum(int ... a){
        int sum=0;
        for (int i:a){
            sum+=i;
        }
        return sum;
    }
    //如果一个方法需要多个参数，则将可变参数放在最后面
//    public static int getsum(int a,int...b){
//        return 0;
//    }
}
