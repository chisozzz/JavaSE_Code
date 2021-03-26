package com.ths01;
/*
    创建一个函数式接口（有且只有一个抽象方法）
    创建一个测试类，里面有两个方法
        一个主方法
        一个使用方法
 */
public class FunctionDemo {
    public static void main(String[] args) {
//        usePrint(new Printable() {
//            @Override
//            public void print() {
//                System.out.println("hello");
//            }
//        });
        //Lambda函数方法实例
        usePrint(s -> System.out.println(s));
        //类的方法引用
        usePrint(System.out::println);
    }
    private static void usePrint(Printable p){
        p.print("hello");
    }
}
