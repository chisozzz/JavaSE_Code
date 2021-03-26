package com.api;
/*
    练习String类的创建方法

 */
public class StringDemo {
    public static void main(String[] args) {
        char [] chs ={'a','b','c'};

        String s = new String();
        System.out.println( "s:"+ s);

        String s1 =new String(chs);
        String s2 =new String(chs);
        System.out.println(s1 == s2);

        String s3 ="abc";
        String s4 ="abc";
        System.out.println(s3 == s4 );

    }
}
