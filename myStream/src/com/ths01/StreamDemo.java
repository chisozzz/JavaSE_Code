package com.ths01;

import java.util.ArrayList;

/*
    需求：按照下面的要求完成集合的创建和遍历
    创建一个集合，存储多个字符串元素
    把集合中所有以"张"开头的元素存储到一个新的集合
    把"张"开头的集合中的长度为3的元素存储到一个新的集合
    遍历上一步得到的集合

 */
public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张曼玉");
        list.add("张无忌");
        list.add("张敏");
        list.add("林青霞");
        list.add("风清扬");
        list.add("吴老");
        ArrayList<String> zhangList = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("张")) {
                zhangList.add(s);
            }
        }
        ArrayList<String> sanList = new ArrayList<>();
        for (String s : zhangList) {
            if (s.length() == 3) {
                sanList.add(s);
            }
        }
        for (String s : sanList) {
            System.out.println(s);
        }
        System.out.println("--------");
        //Stream流的使用方式
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(System.out::println);
    }
}
