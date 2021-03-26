package com.ths03;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
    tcp接收数据的步骤
    创建服务器端的Socket对象(ServerSocket)
    监听客户端连接，返回一个Socket对象
    获取输入流，读数据，并把数据显示在控制台
    释放资源

 */
public class  ServerDemo {
    public static void main(String[] args)throws IOException {
        ServerSocket ss=new ServerSocket(5681);
        Socket s=ss.accept();
        InputStream inputStream = s.getInputStream();
        byte[]bys=new byte[1024];
        int len=inputStream.read(bys);
        System.out.println("数据是："+new String(bys,0,len));
        ss.close();
    }
}
