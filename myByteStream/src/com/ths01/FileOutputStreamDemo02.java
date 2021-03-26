package com.ths01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    FileOutputStream(String name) 创建文件输出流以指定的名称写入文件。
    FileOutputStream(File file) 创建文件输出流以写入由指定的 File对象表示的文件

    void write(int b) 将指定的字节写入此文件输出流
    void write(byte[] b) 将 b.length字节从指定的字节数组写入此文件输出流
    void write(byte[] b, int off, int len) 将 len字节从指定的字节数组开始，从偏移量 off开始写入此文件输出流
 */
public class FileOutputStreamDemo02 {
    public static void main(String[] args) throws IOException {
//        File file = new File("myOutputStream\\\\fos.txt");
//        FileOutputStream fos  = new FileOutputStream(file);

        FileOutputStream fos  = new FileOutputStream("myOutputStream\\fos.txt");
//        //void write(int b) 将指定的字节写入此文件输出流
//        fos.write(97);
//        fos.write(98);
//        fos.write(99);
//        fos.write(100);
//        fos.write(101);

        //void write(byte[] b) 将 b.length字节从指定的字节数组写入此文件输出流
        byte[] bys = {'a','b','c','d','e'};
//        byte[] bys = "abcde".getBytes();
//        fos.write(bys);

        //void write(byte[] b, int off, int len) 将 len字节从指定的字节数组开始，从偏移量 off开始写入此文件输出流
        fos.write(bys,1,3);

        fos.close();
    }
}
