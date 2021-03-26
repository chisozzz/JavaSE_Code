package com.ths06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/*
    用ArrayList和Linklist实现存储字符串并遍历

 */
public class LinkListDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("hello");
        array.add("world");
        array.add("java");
        for (String i : array) {
            System.out.println(i);
        }
        System.out.println("--------");
        Iterator<String> it = array.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("--------");
        for (int i = 0; i < array.size(); i++) {
            String s = array.get(i);
            System.out.println(s);

        }

        //linklist遍历
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");
        System.out.println("--------");
        for (String i : linkedList) {
            System.out.println(i);
        }
        System.out.println("--------");
        Iterator<String> its = linkedList.iterator();
        while (its.hasNext()) {
            String s = its.next();
            System.out.println(s);
        }
        System.out.println("--------");
        for (int i = 0; i < linkedList.size(); i++) {
            String s = array.get(i);
            System.out.println(s);

        }
    }
}
