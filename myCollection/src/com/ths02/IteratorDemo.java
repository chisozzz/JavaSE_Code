package com.ths02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/*
    使用iterator遍历集合 hasnext和next
 */
public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String>c=new ArrayList<>();
        c.add("hello");
        c.add("world");
        c.add("java");
        Iterator<String> it = c.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

    }
}
