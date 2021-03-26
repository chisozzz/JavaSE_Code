package com.ths01;

import java.io.FileInputStream;
import java.io.IOException;

/*
    字节流输出字节文字
    一个汉字的存储，如果是gbk编码占用2个字节，如果是utk占用3个字节
 */
public class FileInputStreamDemo {
    public static void main(String[] args)throws IOException {
        FileInputStream fis  = new FileInputStream("myCharStream\\a.txt");
        int by;
        byte[]bys=new byte[1024];
        while ((by=fis.read(bys))!=-1){
            System.out.println(new String(bys,0,by));
        }
        fis.close();
    }
}
