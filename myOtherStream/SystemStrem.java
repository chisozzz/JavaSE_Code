package com.ths01;

import java.io.*;

/*
    测试标准输入输出流的构造方式，以及其子类的总结性用法
 */
public class SystemStrem {
    public static void main(String[] args)throws IOException {
//        InputStream in = System.in;
//        int len;
//        byte[]bys=new byte[1024];
//        while ((len=in.read(bys))!=-1){
//            System.out.println("你输入的是："+new String(bys,0,len));
//        }
//        in.close();
//        BufferedInputStream bis =new BufferedInputStream(System.in);
//        PrintStream out = System.out;
//        out.print("world");
//        out.println("hello");
//        PrintWriter pw= new PrintWriter("myOtherStream\\pw.txt");
//        pw.println("hello");
//        pw.flush();
        PrintWriter pw=new PrintWriter(new FileWriter("myOtherStream\\pw.txt"),true);
        pw.println("hello");
        pw.println("world");
        pw.close();
    }
}
