package com.ths;

public class MethodTest1 {

    /*基本类型，方法参数传递 形参的改变不影响实参的数值
    public static void main(String[] args) {
        int number = 12;
        System.out.println("方法调用前"+number);
        change(number);
        System.out.println("方法调用后"+number);
    }
    public static int change(int number){
        number = 100;
        return number;
    }
     */
    //引用类型，方法参数传递 形参的改变导致实参也会改变
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println("方法调用前"+arr[1]);
        change(arr);
        System.out.println("方法调用后"+arr[1]);
    }
    public static int change(int[]arr){
        arr[1]= 100;
        return arr[1];
    }
}
