package com.ths02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
    UDP接收数据：因为接收端不知道发送端什么时候停止发送，故采用死循环接收

 */
public class ReceiveDemo {
    public static void main(String[] args)throws IOException {
        DatagramSocket ds =new DatagramSocket(12345);

        while (true){
            byte[]bys=new byte[1024];
            DatagramPacket dp =new DatagramPacket(bys,bys.length);
            ds.receive(dp);
            System.out.println("数据是："+new String(dp.getData(),0,dp.getLength()));
        }

//        ds.close();
    }
}
