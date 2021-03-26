package com.ths03;

import java.io.*;

/*
    案例：复制Java文件(字符缓冲流改进版)
    需求：把模块目录下的“StreamReader.java” 复制到模块目录下的“Copy.java”
    思路：
    根据数据源创建字符缓冲输入流对象
    根据目的地创建字符缓冲输出流对象
    读写数据，复制文件
    释放资源

 */
public class CopyJavaDemo03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new FileReader("myCharStream\\StreamReader.java"));
        BufferedWriter bw  = new BufferedWriter(new FileWriter("myCharStream\\Copy.java"));

        int ch;
        while ((ch=br.read())!=-1){
            bw.write(ch);
        }
//        char[]chs=new char[1024];
//        int len;
//        while ((len=br.read(chs))!=-1){
//            bw.write(chs,0,len);
//        }
        br.close();
        bw.close();
    }
}
