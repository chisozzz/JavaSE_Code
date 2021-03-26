package com.ths05;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ArgsDemo2 {
    public static void main(String[] args) {
//        List<String> l = Arrays.asList("hello", "world", "java");
//        l.add("javase");//UnsupportedOperationException
//        l.remove("hello");//UnsupportedOperationException
//        l.set(0,"javaee");

//        List<String> l = List.of("hello", "world", "java");
//        l.add("javase");//UnsupportedOperationException
//        l.remove("hello");//UnsupportedOperationException
//        l.set(0,"javaee");//UnsupportedOperationException

        Set<String> l = Set.of("hello", "world", "java");
        //Set集合不能重复元素
//        Set<String> l = Set.of("hello", "hello");//IllegalArgumentException
//        l.add("javase");//UnsupportedOperationException
//        l.remove("hello");//UnsupportedOperationException

        System.out.println(l);
    }
}
