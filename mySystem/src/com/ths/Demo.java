package com.ths;

public class Demo {
    public static void main(String[] args) {
        System.out.println("开始");
//        System.exit(0);
        System.out.println("结束");
//        System.out.println(System.currentTimeMillis() / 1000 / 60 / 60 / 24 / 365);
        long l = System.currentTimeMillis();

        for (int i=0;i<10000;i++){
            System.out.println(i);
        }
        long l1 = System.currentTimeMillis();
        System.out.println((l1-l)+"ms");

    }
}
