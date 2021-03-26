package com.ths05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/*
    案例：点名器
    需求：我有一个文件里面存储了班级同学的姓名，每一个姓名占一行，要求通过程序实现随机点名器
    思路：
    创建字符缓冲输入流对象
    创建ArrayList集合对象
    调用字符缓冲输入流对象的方法读数据
    把读取到的字符串数据存储到集合中
    释放资源
    使用Random产生一个随机数，随机数的范围在：[0,集合的长度)
    把第6步产生的随机数作为索引到ArrayList集合中获取值
    把第7步得到的数据输出在控制台

 */
public class CallNameDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("myCharStream\\names.txt"));
        ArrayList<String> array = new ArrayList<>();
        String line;
        while ((line=br.readLine())!=null){
            array.add(line);
        }
        br.close();
        Random r = new Random();
        int i = r.nextInt(array.size());
        String s = array.get(i);
        System.out.println("幸运者是："+s);
    }
}
