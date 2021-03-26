package com.ths01;

import java.io.File;
import java.io.IOException;

/*
    File对象的创建文件/目录的方法
    createNewFile();创建文件，文件创建成功true，文件已存在或创建失败false。当目录中存在相同名字的目录或文件，也会创建失败
    mkdir();创建单个目录，目录不存在，目录创建成功true，目录已存在返回false
    mkdirs();创建多级目录，目录不存在，目录创建成功true，目录已存在返回false
 */
public class FileDemo02 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\ths\\java.txt");
        System.out.println(f1.createNewFile());
        System.out.println("---------");
        File f2 = new File("D:\\ths\\JavaSE");
        System.out.println(f2.mkdir());
        System.out.println("---------");
        File f3 = new File("D:\\ths\\JavaEE\\HTML");
        System.out.println(f3.mkdirs());
        System.out.println("---------");
        File f4 = new File("D:\\ths\\javase.txt");
        System.out.println(f4.createNewFile());


    }
}
