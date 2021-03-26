package com.ths06;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //无参构造方法采用自然排序从小到大
        TreeSet<Integer>ts=new TreeSet<>();
        ts.add(10);
        ts.add(50);
        ts.add(20);
        ts.add(30);
        ts.add(40);
        for (Integer i:ts){
            System.out.println(i);
        }
    }
}
