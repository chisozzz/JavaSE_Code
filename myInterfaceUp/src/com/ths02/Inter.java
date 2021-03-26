package com.ths02;

public interface Inter {
    default void show1(){
        System.out.println("show one 方法开始了");
//        System.out.println("初级工程师");
//        System.out.println("中级工程师");
//        System.out.println("高级工程师");
//        show();
        method();
        System.out.println("show one 方法结束了");
    }
    private void show(){
        System.out.println("初级工程师");
        System.out.println("中级工程师");
        System.out.println("高级工程师");
    }
    default void show2(){
        System.out.println("show two 方法开始了");
//        System.out.println("初级工程师");
//        System.out.println("中级工程师");
//        System.out.println("高级工程师");
//        show();
        method();
        System.out.println("show two 方法结束了");
    }
    static void method(){
        System.out.println("初级工程师");
        System.out.println("中级工程师");
        System.out.println("高级工程师");
    }
    static void method1(){
        System.out.println("method one 方法开始了");
//        System.out.println("初级工程师");
//        System.out.println("中级工程师");
//        System.out.println("高级工程师");
        method();
        System.out.println("method one方法结束了");
    }
    static void method2(){
        System.out.println("method two 方法开始了");
//        System.out.println("初级工程师");
//        System.out.println("中级工程师");
//        System.out.println("高级工程师");
        method();
        System.out.println("method two 方法结束了");
    }
}
