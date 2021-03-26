package com.ths01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
    Set集合练习
    该集合不能包含重复元素
    不能保证迭代顺序
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<String>set=new HashSet<>();
        set.add("hello");
        set.add("world");
        set.add("java");
        //添加重复元素，实验，不报错但是不添加重复元素
        set.add("java");
        System.out.println(set.size());

        for (String i:set){
            System.out.println(i);
        }
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);

        }
    }
}
