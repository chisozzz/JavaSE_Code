package com.ths03;

import java.io.*;

/*
    案例：复制Java文件(字符缓冲流特有功能改进版)
    需求：把模块目录下的“ConversionStreamDemo.java” 复制到模块目录下的“Copy.java”
    思路：
    根据数据源创建字符缓冲输入流对象
    根据目的地创建字符缓冲输出流对象
    读写数据，复制文件
    使用字符缓冲流特有功能实现
    释放资源

 */
public class CopyJavaDemo04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("myCharStream\\StreamReader.java"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("myCharStream\\Copy.java"));
        String line;
        while ((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();

        }
        br.close();
        bw.close();
    }
}
