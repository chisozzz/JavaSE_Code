package com.ths01;

import java.io.File;

/*

 */
public class FileDemo03 {
    public static void main(String[] args) {
        File f1 = new File("myFile\\java.txt");
        System.out.println(f1.isDirectory());//判断对象是否是目录
        System.out.println(f1.isFile());//判断对象是否是文件
        System.out.println(f1.exists());//判断对象是否存在
        System.out.println("--------");
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getPath());
        System.out.println(f1.getName());
        System.out.println("--------");

        File f2 = new File("D:\\ths");
        String[] str = f2.list();
        for (String s:str){
            System.out.println(s);
        }
        System.out.println("---------");
        File[] f3 = f2.listFiles();
        for (File s:f3){
//            System.out.println(s);
//            System.out.println(s.getName());
            if (s.isFile()){
                System.out.println(s.getName());
            }
        }
    }
}
