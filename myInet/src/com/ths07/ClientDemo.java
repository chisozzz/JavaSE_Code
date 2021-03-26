package com.ths07;

import java.io.*;
import java.net.Socket;

//数据来自于文本文件
public class ClientDemo {
    public static void main(String[] args)throws IOException {
        Socket s=new Socket("192.168.0.105",5891);

        BufferedReader br=new BufferedReader(new FileReader("myInet\\InetAdressDemo.java"));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while ((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        s.close();
        br.close();
    }
}
