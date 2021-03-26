package com.ths02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr  = new InputStreamReader(new FileInputStream("myCharStream\\osw.txt"));
//        int ch;
//        while ((ch= isr.read())!=-1){
//            System.out.print((char)ch);
//        }

        char[]chs=new char[1024];
        int len;
        while ((len=isr.read(chs))!=-1){
            System.out.println(new String(chs,0,len));
        }
        isr.close();
    }
}
