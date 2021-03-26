package com.ths05;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
    需求：把ArrayList集合中的字符串数据写入到文本文件。要求：每一个字符串元素作为文件中的一行数据
    思路：
    创建ArrayList集合
    往集合中存储字符串元素
    创建字符缓冲输出流对象
    遍历集合，得到每一个字符串数据
    调用字符缓冲输出流对象的方法写数据
    释放资源

 */
public class ArrayListToTxt {
    public static void main(String[] args) throws IOException {
        ArrayList<String> array = new ArrayList<>();
        array.add("hello");
        array.add("hello");
        array.add("hello");
        BufferedWriter bw = new BufferedWriter(new FileWriter("myCharStream\\arr.txt"));
        for (String s:array){
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
