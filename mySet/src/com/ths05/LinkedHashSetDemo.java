package com.ths05;

import java.util.LinkedHashSet;
/*
    由哈希表和链表构造的保证了迭代顺序的连续性，存入和取出都是一致的
    哈希表保证了存入元素的不重复

 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("hello");
        lhs.add("world");
        lhs.add("java");
        for (String s : lhs) {
            System.out.println(s);
        }
    }
}
