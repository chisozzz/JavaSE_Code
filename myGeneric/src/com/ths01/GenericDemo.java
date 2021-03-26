package com.ths01;

import java.util.ArrayList;
import java.util.Collection;

public class GenericDemo {
    public static void main(String[] args) {

        //String在这就相当于使用了泛型类，String为实参，E为泛型
        Collection<String>c=new ArrayList<>();
        c.add("hello");
        c.add("world");
        for (String s:c){
            System.out.println(s);
        }
    }
}
