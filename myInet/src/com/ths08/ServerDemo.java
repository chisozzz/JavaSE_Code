package com.ths08;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//上传文件
//服务器：接收到的数据写入文本文件，给出反馈
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(5891);
        BufferedWriter bw = new BufferedWriter(new FileWriter("myInet\\Copy.java"));
        Socket s = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line;
        while ((line = br.readLine()) != null) {
//            if ("886".equals(line)){
//                break;
//            }
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        BufferedWriter bw2=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bw2.write("服务器接受数据成功");
        bw2.newLine();
        bw2.flush();

        ss.close();
        bw.close();
        bw2.close();


    }
}
