package com.ths02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    需求：把“D:\\itcast\\窗里窗外.txt”复制到模块目录下的“窗里窗外.txt”
    分析：
        复制文本文件，其实就把文本文件的内容从一个文件中读取出来(数据源)，然后写入到另一个文件中(目的地)
        数据源：
        D:\\itcast\\窗里窗外.txt --- 读数据 --- InputStream --- FileInputStream
        目的地：
        myByteStream\\窗里窗外.txt --- 写数据 --- OutputStream --- FileOutputStream
    思路：
    根据数据源创建字节输入流对象
    根据目的地创建字节输出流对象
    读写数据，复制文本文件(一次读取一个字节，一次写入一个字节)
    释放资源
 */
public class CopyTextDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis  = new FileInputStream("D:\\itcast\\窗里窗外.txt");
        FileOutputStream fos  = new FileOutputStream("myOutputStream\\窗里窗外.txt");
        int by;
        while ((by=fis.read()) !=-1){
            fos.write(by);
        }
        fis.close();
        fos.close();
    }
}
