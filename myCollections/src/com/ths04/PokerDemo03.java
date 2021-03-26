package com.ths04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerDemo03 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        ArrayList<Integer> array = new ArrayList<>();
        String[] colors = {"♦", "♣", "♥", "♠"};
        String[] nums = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        int index = 0;
        for (String num : nums) {
            for (String color : colors) {
                hm.put(index, color + num);
                array.add(index);
                index++;
            }
        }
        hm.put(index, "小王");
        array.add(index);
        index++;
        hm.put(index, "大王");
        array.add(index);
//        for (Integer integer : hm.keySet()) {
//            String s = hm.get(integer);
//            System.out.println(integer+":"+s);
//        }
        Collections.shuffle(array);
        TreeSet<Integer> one = new TreeSet<>();
        TreeSet<Integer> two = new TreeSet<>();
        TreeSet<Integer> three = new TreeSet<>();
        TreeSet<Integer> ed = new TreeSet<>();
        for (Integer integer : array) {
            if (integer> array.size()-4 ) {
                ed.add(integer);
            } else if (integer % 3 == 0) {
                one.add(integer);
            } else if (integer % 3 == 1) {
                two.add(integer);
            } else if (integer % 3 == 2) {
                three.add(integer);
            }
        }
        lookPoker("玩家1",one,hm);
        lookPoker("玩家2",two,hm);
        lookPoker("玩家3",three,hm);
        lookPoker("底牌",ed,hm);
    }
    private static void lookPoker(String name,TreeSet<Integer> ts,HashMap<Integer,String> hm){
        System.out.print(name+"：");
        for (Integer i : ts) {
            String value = hm.get(i);
            System.out.print(value+" ");
        }
        System.out.println();
    }
}
