package com.ths04;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
    服务器：接收数据，给出反馈

 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(5681);
        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        byte[]bys=new byte[1024];
        int len = is.read(bys);
        System.out.println("服务器"+new String(bys,0,len));

        OutputStream os = s.getOutputStream();
        os.write("服务器接受数据成功".getBytes());

        ss.close();
    }
}
