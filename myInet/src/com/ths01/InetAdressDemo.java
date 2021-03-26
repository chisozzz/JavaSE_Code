package com.ths01;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
    InetAddress：此类表示Internet协议（IP）地址
    static InetAddress getByName(String host) 确定主机名称的IP地址。
    String getHostAddress() 返回文本显示中的IP地址字符串。
    String getHostName() 获取此IP地址的主机名
 */
public class InetAdressDemo {
    public static void main(String[] args) throws UnknownHostException {

//        InetAddress address = InetAddress.getByName("DESKTOP-2CIRSBH");
        InetAddress address = InetAddress.getByName("192.168.0.105");
        String hostName = address.getHostName();
        String hostAddress = address.getHostAddress();

        System.out.println("本机名："+  hostName);
        System.out.println("IP地址："+  hostAddress);
    }
}
