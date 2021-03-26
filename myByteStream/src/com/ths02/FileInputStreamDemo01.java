package com.ths02;
/*
    需求：把文件fos.txt中的内容读取出来在控制台输出

    FileInputStream：从文件系统中的文件获取输入字节
    FileInputStream(String name)：通过打开与实际文件的连接来创建一个 FileInputStream ，该文件由文件系统中的路径名 name命名

    使用字节输入流读数据的步骤：
    创建字节输入流对象
    调用字节输入流对象的读数据方法
    释放资源

 */

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo01   {
    public static void main(String[] args) throws IOException {
        FileInputStream fis  = new FileInputStream("myOutputStream\\fos.txt");
        //文件读取的通用操作
        byte[]bys=new byte[1024];//使用1024或则是其倍数
        int read = fis.read(bys, 0, bys.length);
        if (read!=-1){
            System.out.println(new String(bys,0,bys.length));
        }

        fis.close();
    }
}
