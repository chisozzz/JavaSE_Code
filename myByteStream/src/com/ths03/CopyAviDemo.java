package com.ths03;

import java.io.*;

/*
    需求：把“E:\\itcast\\字节流复制图片.avi”复制到模块目录下的“字节流复制图片.avi”
    思路：
    根据数据源创建字节输入流对象
    根据目的地创建字节输出流对象
    读写数据，复制视频
    释放资源

    基本字节流实现一次读写一个字符      72100
    基本字节流实现一次读写一个字节数组   102
    字节缓冲流实现一次读写一个字节      318
    字节缓冲流实现一次读写一个字符数组   31
    字节流实现一次读写全部字节         50
    字节缓冲流实现一次读写全部字节      49
 */
public class CopyAviDemo {
    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();
//        method1();//72100
//        method2();//102
//        method3();//318
//        method4();//31
//        method5();//50
        method6();//49
        long endTime = System.currentTimeMillis();
        System.out.println("共耗时：" + (endTime-startTime) + "ms");
    }

    //基本字节流实现一次读写一个字符
    public static void method1() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\itcast\\字节流复制图片.avi");
        FileOutputStream fos = new FileOutputStream("myByteStream\\字节流复制图片.avi");
        int by;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }

        fis.close();
        fos.close();
    }

    //基本字节流实现一次读写一个字节数组
    public static void method2() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\itcast\\字节流复制图片.avi");
        FileOutputStream fos = new FileOutputStream("myByteStream\\字节流复制图片.avi");
        int len;
        byte[] bys = new byte[1024];
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }
        fis.close();
        fos.close();
    }

    //字节缓冲流实现一次读写一个字节
    public static void method3() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\itcast\\字节流复制图片.avi"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myByteStream\\字节流复制图片.avi"));
        int by;
        while ((by = bis.read()) != -1) {
            bos.write(by);
        }
        bis.close();
        bos.close();
    }

    ////字节缓冲流实现一次读写一个字符数组
    public static void method4() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\itcast\\字节流复制图片.avi"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myByteStream\\字节流复制图片.avi"));
        int by;
        byte[] bys = new byte[1024];
        while ((by = bis.read(bys)) != -1) {
            bos.write(bys, 0, by);
        }
        bis.close();
        bos.close();
    }

    //字节流实现一次读写全部字节
    public static void method5() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\itcast\\字节流复制图片.avi");
        FileOutputStream fos = new FileOutputStream("myByteStream\\字节流复制图片.avi");
        byte[] bytes = fis.readAllBytes();
        fos.write(bytes);
        fis.close();
        fos.close();

    }

    //字节缓冲流实现一次读写全部字节
    public static void method6() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\itcast\\字节流复制图片.avi"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myByteStream\\字节流复制图片.avi"));
        byte[] bytes = bis.readAllBytes();
        bos.write(bytes);
        bis.close();
        bos.close();
    }
}
