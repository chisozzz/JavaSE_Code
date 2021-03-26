package com.ths04;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String >list=new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");

        ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()){
            String s = lit.next();
            System.out.println(s);
        }
        System.out.println("--------");
        while (lit.hasPrevious()){
            String previous = lit.previous();
            System.out.println(previous);
        }


        System.out.println("--------");
        while (lit.hasNext()){
            String next = lit.next();
            //迭代器操作中只能遍历或者对元素操作，不能同时进行
            //遍历只能遍历操作前的List链表
            if (next.equals("world")){
//                lit.add("javase");
                lit.set("javase");
            }
        }
        System.out.println(list);
    }
}
