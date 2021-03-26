package com.api;
/*
    练习StringBuilder的length和capacity的用法
 */
public class StringDemo2 {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder();
        sb.append("helloworld");
        sb.append("java").append(666).append("love");
        System.out.println(sb.toString());
        System.out.println(sb.length());
        //理论空间最少16
        System.out.println(sb.capacity());
        printStringbd(sb);
    }
    public static void printStringbd(StringBuilder line){
        for (int i=0;i<line.length();i++){
            System.out.print(line.charAt(i));
        }
    }
}
