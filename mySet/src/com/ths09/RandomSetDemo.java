package com.ths09;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class RandomSetDemo {
    public static void main(String[] args) {
        //不排序
//        HashSet<Integer> hs = new HashSet<>();

        //排序
        TreeSet<Integer> hs = new TreeSet<>();

        while (hs.size()<10){
            Random r = new Random();
            int number=r.nextInt(20)+1;
            hs.add(number);
        }
        for (Integer i:hs){
            System.out.println(i);
        }
    }
}
