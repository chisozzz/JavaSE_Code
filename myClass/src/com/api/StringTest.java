package com.api;
/*
    练习使用StringBuilder创建对象
    两种StringBuilder构造方法
 */
public class StringTest {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder();
//        sb.append("hello");
//        sb.append("world");

        sb.append("hello").append("world");
        String s=sb.toString();
        System.out.println(s);
        String ss="helloworld";
        StringBuilder sb2 = new StringBuilder(ss);
        System.out.println(sb2.toString());
    }
}
