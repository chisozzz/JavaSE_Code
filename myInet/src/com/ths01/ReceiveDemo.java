package com.ths01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/*
    UDP接收数据
    接收数据的步骤
    创建接收端的Socket对象(DatagramSocket)
    创建一个数据包，用于接收数据
    调用DatagramSocket对象的方法接收数据
    解析数据包，并把数据在控制台显示
    关闭接收端

 */
public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds =new DatagramSocket(10086);
        byte[]bys=new byte[1024];
        int length=bys.length;
        DatagramPacket dp =new DatagramPacket(bys,length);
        ds.receive(dp);
        System.out.println(new String(dp.getData(),0, dp.getLength()));


        ds.close();
    }
}
