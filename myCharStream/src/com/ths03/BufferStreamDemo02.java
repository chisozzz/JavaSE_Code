package com.ths03;

import java.io.*;

/*
    BufferedWriter：
    void newLine()：写一行行分隔符，行分隔符字符串由系统属性定义

    BufferedReader：
    public String readLine() ：读一行文字。 结果包含行的内容的字符串，不包括任何行终止字符，如果流的结尾已经到达，则为null

 */
public class BufferStreamDemo02 {
    public static void main(String[] args) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter("myCharStream\\bw.txt"));
//        for (int i = 0; i < 10; i++) {
//            bw.write("hello"+i);
//            bw.newLine();
//            bw.flush();
//        }
//        bw.close();
        BufferedReader br = new BufferedReader(new FileReader("myCharStream\\bw.txt"));
        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();

    }
}
