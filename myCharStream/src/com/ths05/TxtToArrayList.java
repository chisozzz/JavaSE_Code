package com.ths05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
    需求：把文本文件中的数据读取到集合中，并遍历集合。要求：文件中每一行数据是一个集合元素
    思路：
    创建字符缓冲输入流对象
    创建ArrayList集合对象
    调用字符缓冲输入流对象的方法读数据
    把读取到的字符串数据存储到集合中
    释放资源
    遍历集合

 */
public class TxtToArrayList {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("myCharStream\\arr.txt"));
        ArrayList<String> array = new ArrayList<>();
        String line;
        while ((line=br.readLine())!=null){
            array.add(line);
        }
        for (String s:array){
            System.out.println(s);
        }
        br.close();
    }
}
