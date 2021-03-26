package com.ths09;

import java.io.*;
import java.net.Socket;

public class ServerSoc implements Runnable {
    Socket s=new Socket();

    public ServerSoc(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
            int count=0;
            BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
            File f=new File("myInet\\Copy"+count+".java");
            while (f.exists()){
                count++;
                f=new File("myInet\\Copy"+count+".java");
            }
            BufferedWriter bw=new BufferedWriter(new FileWriter(f));
            String line;
            while ((line=br.readLine())!=null){
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
            BufferedWriter br2=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            br2.write("上传文件成功");
            br2.newLine();
            br2.flush();
            s.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
