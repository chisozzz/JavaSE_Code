package com.ArrayList;
//需求：创建一个存储字符串的集合，存储3个字符串元素，使用程序实现在控制台遍历该集合

import java.util.ArrayList;

public class Practice01 {
    public static void main(String[] args) {
        ArrayList<String> array=new ArrayList<>();
        array.add("hello");
        array.add("java");
        array.add("world");
        for (String s:array){
            System.out.println(s);
        }
    }
}
