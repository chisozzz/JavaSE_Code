package com.ths05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

//服务器：接收到的数据在控制台输出
public class ServerDemo {
    public static void main(String[] args)throws IOException {
        ServerSocket ss=new ServerSocket(5891);
        Socket s = ss.accept();
        while (true){
//            InputStream is = s.getInputStream();

//            byte[]bys=new byte[1024];
//            int len = br.read(bys);
//            if (len==-1){
//                continue;
//            }
//            System.out.println("服务器："+new String(bys,0,len));
            BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
            String line;
            while ((line=br.readLine())!=null){
                System.out.println("服务器："+line);
            }
        }
    }
}
