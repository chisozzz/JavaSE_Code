package com.ths01;

public class PrintableDemo {
    public static void main(String[] args) {
        //Lambda方法实例化
//        usePrint((String s)->{
//            System.out.println(s);
//        });
//        usePrint(s -> System.out.println(s));

        usePrint(System.out::println);
    }
    private static void usePrint(Printable p){
        p.print("HelloWorld");
    }
}
