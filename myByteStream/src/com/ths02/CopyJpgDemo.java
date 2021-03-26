package com.ths02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    需求：把“E:\\itcast\\mn.jpg”复制到模块目录下的“mn.jpg”
    思路：
    根据数据源创建字节输入流对象
    根据目的地创建字节输出流对象
    读写数据，复制图片(一次读取一个字节数组，一次写入一个字节数组)
    释放资源

 */
public class CopyJpgDemo {
    public static void main(String[] args)throws IOException {
        FileInputStream fis  = new FileInputStream("D:\\itcast\\mn.jpg");
        FileOutputStream fos  = new FileOutputStream("myOutputStream\\mn.jpg");
        byte[] bytes = fis.readAllBytes();
        fos.write(bytes);
        fis.close();
        fos.close();
    }
}
