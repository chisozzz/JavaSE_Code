package com.ths;
/*
    方法重载指同一个类中定义的多个方法之间的关系，满足下列条件的多个方法相互构成重载
    多个方法在同一个类中
    多个方法具有相同的方法名
    多个方法的参数不相同，类型不同或者数量不同
    方法名相同同时参数不同就是重载
 */
public class MethodOverload {
    public static void main(String[] args) {
        System.out.println(getSum(2,3));
        System.out.println(getSum(2.2,3.2));
        System.out.println(getSum(1,1,3));
    }
    public static int getSum(int a, int b){
        System.out.println("int");
        return a+b;
    }
    public static double getSum(double a, double b){
        System.out.println("double");
        return a+b;
    }
    public static int getSum(int a, int b,int c){
        System.out.println("three");
        return a+b+c;
    }

}
