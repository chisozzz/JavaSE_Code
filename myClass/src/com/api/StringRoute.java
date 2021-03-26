package com.api;
/*
    使用Debug查看String类的内存创建
 */
public class StringRoute {
    public static void main(String[] args) {
        String s ="hello";
        s+="world";
        System.out.println("s:"+s);
    }
}
