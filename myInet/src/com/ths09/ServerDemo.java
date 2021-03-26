package com.ths09;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//上传文件
//接收到的数据写入文本文件，给出反馈，代码用线程进行封装，为每一个客户端开启一个线程
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(5891);

        while (true){
            Socket s = ss.accept();
            new Thread(new ServerSoc(s)).start();
        }
    }
}
