package com.ths06;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//接收到的数据写入文本文件
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(5891);
        BufferedWriter bw = new BufferedWriter(new FileWriter("myInet\\s.txt"));
        Socket s = ss.accept();
        while (true){
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
        }



    }
}
