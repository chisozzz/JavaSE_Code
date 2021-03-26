package com.ths04;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*

    需求：把模块目录下的“StreamReader.java” 复制到模块目录下的“Copy.java”
    思路：
    根据数据源创建字符输入流对象
    根据目的地创建字符输出流对象
    读写数据，复制文件
    释放资源

 */
public class CopyJavaDemo02 {
    public static void main(String[] args)throws IOException {
        FileReader fileReader = new FileReader("myCharStream\\StreamReader.java");
        FileWriter fileWriter = new FileWriter("myCharStream\\Copy.java");
        int ch;
        while ((ch=fileReader.read())!=-1){
            fileWriter.write(ch);
        }
//        char[]chs=new char[1024];
//        int len;
//        while ((len=fileReader.read(chs))!=-1){
//            fileWriter.write(chs,0,len);
//        }
        fileReader.close();
        fileWriter.close();
    }
}
