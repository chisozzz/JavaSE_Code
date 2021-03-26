package com.ths02;

import java.util.ArrayList;

/*
    案例：存储字符串并遍历
    需求：创建一个存储字符串的集合，存储3个字符串元素，使用程序实现在控制台遍历该集合

 */
public class arrayListTest {
    public static void main(String[] args) {
        ArrayList<String>array =new ArrayList<>();
        String s=new String("林青霞");
        String s1=new String("张曼玉");
        String s2=new String("周星驰");
        array.add(s);
        array.add(s1);
        array.add(s2);
        for (int i=0;i<array.size();i++){
            String ss= array.get(i);
            System.out.println(ss);
        }
    }
}
