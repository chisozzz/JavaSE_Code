package com.ths04;

import java.io.*;

/*

    需求：把模块目录下的“StreamReader.java” 复制到模块目录下的“Copy.java”
    思路：
    根据数据源创建字符输入流对象
    根据目的地创建字符输出流对象
    读写数据，复制文件
    释放资源

 */
public class CopyJavaDemo01 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw  = new OutputStreamWriter(new FileOutputStream("myCharStream\\Copy.java"));
        InputStreamReader isr  = new InputStreamReader(new FileInputStream("myCharStream\\StreamReader.java"));
//        int ch;
//        while ((ch=isr.read())!=-1){
//            osw.write(ch);
//        }
        char[]chs=new char[1024];
        int len;
        while ((len=isr.read(chs))!=-1){
            osw.write(chs,0,len);
        }

        isr.close();
        osw.close();
    }
}
