package com.ths01;

import java.io.File;

/*
    File类的构造方法
    new File("");
 */
public class FileDemo01 {
    public static void main(String[] args) {
        File f1 = new File("D:\\ths\\java.txt");
        System.out.println(f1);

        File f2 = new File("D:\\ths", "java.txt");
        System.out.println(f2);

        File f3 = new File("D:\\ths");
        File f4 = new File(f3, "java.txt");

        File f5=new File("myFile\\java.txt");
        System.out.println(f4);
//        System.out.println(f5.exists());
    }
}
