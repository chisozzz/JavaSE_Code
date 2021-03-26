package com.ths03;

import java.io.*;

/*

 */
public class BufferStreamDemo01 {
    public static void main(String[] args) throws IOException {
//        BufferedWriter bw  = new BufferedWriter(new FileWriter("myCharStream\\bw.txt"));
//        bw.write("hello\r\n");
//        bw.write("world\r\n");
//        bw.close();

        BufferedReader br  = new BufferedReader(new FileReader("myCharStream\\bw.txt"));
//        int ch;
//        while ((ch=br.read())!=-1){
//            System.out.print((char)ch);
//        }
        char[]chs=new char[1024];
        int len;
        while ((len=br.read(chs))!=-1){
            System.out.print(new String(chs,0,len));
        }

        br.close();
    }
}
