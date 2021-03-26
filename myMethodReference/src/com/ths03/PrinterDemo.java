package com.ths03;
/*
    练习
    定义一个类(PrintString)，里面定义一个方法
        public void printUpper(String s)：把字符串参数变成大写的数据，然后在控制台输出
    定义一个接口(Printer)，里面定义一个抽象方法
        void printUpperCase(String s)
    定义一个测试类(PrinterDemo)，在测试类中提供两个方法
        一个方法是：usePrinter(Printer p)
        一个方法是主方法，在主方法中调用usePrinter方法
 */
public class PrinterDemo {
    public static void main(String[] args) {
//        usePrinter((String s )->{
//            String s1 = s.toUpperCase();
//            System.out.println(s1);
//        });
//        usePrinter(s-> System.out.println(s.toUpperCase()));
        usePrinter(PrintString::printUpper);

    }

    private static void usePrinter(Printer p){
        p.printUpperCase("HelloWorld");
    }
}
