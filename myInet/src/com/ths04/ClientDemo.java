package com.ths04;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
    客户端：发送数据，接收服务器反馈

 */
public class ClientDemo {
    public static void main(String[] args)throws IOException {
        Socket s=new Socket("192.168.0.105",5681);
        OutputStream os = s.getOutputStream();
        os.write("hello,java,世界".getBytes());

        InputStream is = s.getInputStream();
        byte[]bys=new byte[1024];
        int len=is.read(bys);
        System.out.println("客户端："+new String(bys,0,len));

        s.close();
    }
}
