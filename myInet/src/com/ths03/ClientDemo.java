package com.ths03;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/*
    tcp发送数据的步骤
    创建客户端的Socket对象(Socket)
    获取输出流，写数据
    释放资源

 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("192.168.0.105",5681);
        OutputStream os = s.getOutputStream();
        os.write("hello,java,世界".getBytes());
        s.close();
    }
}
