package com.ths01;

import java.io.FileOutputStream;
import java.io.IOException;

/*
    finally：在异常处理时提供finally块来执行所有清除操作。比如说IO流中的释放资源
    特点：被finally控制的语句一定会执行，除非JVM退出

    try catch finally
 */
public class FileOutputStreamDemo04 {
    public static void main(String[] args) {
            FileOutputStream fos =null;
        try {
            fos = new FileOutputStream("myOutputStream\\fos.txt");
            fos.write("hello".getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //为了代码的健壮，fos不能为null
            if (fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
