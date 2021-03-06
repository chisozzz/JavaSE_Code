package com.ths01;

import java.io.IOException;
import java.net.*;

/*
    UDP发送数据
    发送数据的步骤
    创建发送端的Socket对象(DatagramSocket)
    创建数据，并把数据打包
    调用DatagramSocket对象的方法发送数据
    关闭发送端

 */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        //创建发送端的Socket对象(DatagramSocket)
        //DatagramSocket() 构造数据报套接字并将其绑定到本地主机上的任何可用端口。
        DatagramSocket ds=new DatagramSocket();
        //创建数据，并把数据打包
        //DatagramPacket(byte[] buf, int length, InetAddress address, int port)
        // 构造一个数据包，发送长度为 length的数据包到指定主机上的指定端口号。
        byte[]buf="hello,world,java".getBytes();
//        int length=buf.length;
//        InetAddress address= InetAddress.getByName("DESKTOP-2CIRSBH");
//        int port=10086;
//        DatagramPacket dp =new DatagramPacket(buf,length,address,port);
        DatagramPacket dp=new DatagramPacket(buf,buf.length,InetAddress.getByName("192.168.0.105"),10086);
        //调用DatagramSocket对象的方法发送数据
        //void send(DatagramPacket p) 从此套接字发送数据报包
        ds.send(dp);
        //关闭发送端
        //void close() 关闭此数据报套接字。
        ds.close();
    }
}
