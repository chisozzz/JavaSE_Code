package com.ths03;

import java.io.*;

/*
    构造方法：
    字节缓冲输出流：BufferedOutputStream(OutputStream out)只是一个缓冲区域byte[]，实际操作还是需要使用FileOutputStream
    字节缓冲输入流：BufferedInputStream(InputStream in)只是一个缓冲区域byte[]，实际操作还是需要使用FileInputStream

 */
public class BufferStreamDemo01 {
    public static void main(String[] args)throws IOException {
//        BufferedOutputStream bos  = new BufferedOutputStream(new FileOutputStream("myByteStream\\bos.txt"));
//        bos.write("hello\r\n".getBytes());
//        bos.write("world\r\n".getBytes());
//        bos.close();

        BufferedInputStream bis  = new BufferedInputStream(new FileInputStream("myByteStream\\bos.txt"));
        //一个一个读取字节
//        int by;
//        while ((by=bis.read())!=-1){
//            System.out.print((char)by);
//        }
        //一次读取一个字节数组
        byte[]bys=new byte[1024];
        int len;//实际读取的长度
        while (((len=bis.read(bys))!=-1)){
            System.out.println(new String(bys,0,len));//从bys字节数组0索引开始String化知道实际bys的实际读取长度
        }
        bis.close();
    }
}
