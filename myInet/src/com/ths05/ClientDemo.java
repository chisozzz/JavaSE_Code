package com.ths05;

import java.io.*;
import java.net.Socket;

//客户端：数据来自于键盘录入，直到输入的数据是886，发送数据结束
public class ClientDemo {
    public static void main(String[] args)throws IOException {
        Socket s=new Socket("192.168.0.105",5891);

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while ((line=br.readLine())!=null){
            if ("886".equals(line)){
                break;
            }
//            OutputStream os = s.getOutputStream();
//            os.write(line.getBytes());
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        s.close();
    }
}
