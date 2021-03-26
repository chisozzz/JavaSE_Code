package com.ths09;

import java.io.*;
import java.net.Socket;

//客户端：数据来自于文本文件，接收服务器反馈
public class ClientDemo {
    public static void main(String[] args)throws IOException {
        Socket s=new Socket("192.168.0.105",5891);

        BufferedReader br=new BufferedReader(new FileReader("myInet\\InetAdressDemo.java"));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        BufferedReader br2=new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line;
        while ((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //自定义结束标记
//        bw.write("886");
//        bw.newLine();
//        bw.flush();

        //Socket自带的输出流结束语句
        s.shutdownOutput();
        String not;
        while ((not=br2.readLine())!=null){
            System.out.println("服务器反馈："+not);
        }
        s.close();
        br.close();
        br2.close();
    }
}
