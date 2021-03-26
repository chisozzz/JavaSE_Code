package com.ths01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    FileOutputStream是OutputStream的子类，可以直接创建对象
    FileOutputStream(String name) 创建文件输出流以指定的名称写入文件
    void write(int b) 将指定的字节写入此文件输出流
    void close() 关闭此文件输出流并释放与此流相关联的任何系统资源
 */
public class FileOutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("myOutputStream\\fos.txt");
        /*
            创建字节输出流对象(调用系统功能创建了文件，创建字节输出流对象，让字节输出流对象指向文件)

         */
        fos.write(97);//字节自动转换成符号char
//        fos.write(57);
//        fos.write(55);

        //最后，关闭所有IO操作使用的资源
        fos.close();
    }
}
