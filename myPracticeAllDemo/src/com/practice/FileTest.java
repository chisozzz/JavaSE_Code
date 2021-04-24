package com.practice;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
/*        File file = new File("myPracticeAllDemo\\text.txt");
//        File file1 = new File("text.txt");
        boolean newFile = file.createNewFile();
        System.out.println(newFile);
//        file1.delete();文件的删除
        *//*在Idea中使用Junit测试使用文件，相对路径是对于模块
        * 使用main文件测试File文件，相对路径是相对于Project工程
        * 在Eclipse中文件相对路径都是相对于Project工程*//*
        System.out.println(file.getAbsoluteFile());//绝对路径
        System.out.println(file.getName());//文件的名称
        System.out.println(file.getPath());//文件的相对路径
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());*/
        java.io.File dir = new java.io.File("D:\\01.20年6月新东方四级");
        printFile(dir);
    }
    //将一个文件夹中的所有文件的相对路径打印出来,
    // 传入一个File类dir
    public static void printFile(java.io.File dir){
        if (dir.isFile()){
            System.out.println(dir.getAbsoluteFile());
        }else {
            java.io.File[] files = dir.listFiles();
            if (files == null || files.length == 0) {//如果是空文件夹则直接返回
                return;
            }
            for (java.io.File file : files) {
                printFile(file);
            }
        }
    }
}
