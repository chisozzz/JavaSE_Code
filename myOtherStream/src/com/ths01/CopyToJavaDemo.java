package com.ths01;

import java.io.*;

/*
    需求：把模块目录下的SystemStrem.java 复制到模块目录下的 Copy.java
    思路：
    根据数据源创建字符输入流对象
    根据目的地创建字符输出流对象
    读写数据，复制文件
    释放资源

 */
public class CopyToJavaDemo {
    public static void main(String[] args)throws IOException {
        BufferedReader br =new BufferedReader(new FileReader("myOtherStream\\SystemStrem.java"));
        PrintWriter pw =new PrintWriter(new FileWriter("myOtherStream\\Copy.java"),true);
        String line;
        while ((line=br.readLine())!=null){
            pw.println(line);
        }
        br.close();
        pw.close();
    }
}
