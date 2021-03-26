package com.ths01;

public class DefaultDemo {
    public static void main(String[] args) {
        InterfaceExam ie =new InterfaceExam() {
            @Override
            public void show() {
                System.out.println("重写show后执行了");
            }
        };
        //抽象方法
        ie.show();
        //默认方法
        ie.show4();
    }
}
