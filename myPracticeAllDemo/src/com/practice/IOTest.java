package com.practice;

import java.io.*;

public class IOTest {
    public static void main(String[] args) {
        /*File file = new File("myPracticeAllDemo\\text.txt");
        FileReader fr=null;
        try {
             fr =new FileReader(file);
            char[] ch=new char[5];
            int len;
            while ((len = fr.read(ch)) != -1){
                String s=new String(ch,0,len);
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr !=null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }*/
        /*FileWriter fw = null;//向文件中写入字符信息
        try {
            fw = new FileWriter(new File("text.txt"));
            fw.write("今天是多么美好！！！\n");
            fw.write("天气很好。");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw !=null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }*/
        //复制文本内容到目标文件
        File desFile = new File("text.txt");
        File srcFile = new File("myPracticeAllDemo\\text.txt");
        FileReader fr = null;
        FileWriter fw = null;
        try {
             fr = new FileReader(srcFile);
             fw = new FileWriter(desFile);
            char[] chars = new char[5];
            int len;
            while ((len = fr.read(chars)) != -1){
                fw.write(chars,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
