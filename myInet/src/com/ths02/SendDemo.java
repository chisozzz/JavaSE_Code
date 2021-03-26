package com.ths02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
    UDP发送数据：数据来自于键盘录入，直到输入的数据是886，发送数据结束

 */
public class SendDemo {
    public static void main(String[] args)throws IOException {
        DatagramSocket ds =new DatagramSocket();


            BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
            String len;
            while ((len=dr.readLine())!=null){
                if ("886".equals(len)){
                    break;
                }
                byte[]bys=len.getBytes();
                DatagramPacket dp =new DatagramPacket(bys,bys.length, InetAddress.getByName("192.168.0.105"),12345);
                ds.send(dp);
            }
            ds.close();
            dr.close();
    }
}
