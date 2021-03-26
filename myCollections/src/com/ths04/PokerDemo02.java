package com.ths04;

import java.util.*;

/*
    清晰版
    装牌：建立一个hashmap集合，key为0-53，值为数值
    洗牌：建立一个key集合，使用随机打乱
    发牌：创建底牌，玩家1，玩家2，玩家3，treemap集合，将key集合分派给四个treemap，用key对应值
    看牌：照样

    码字的时候不要急，要利用idea的提示，慢慢创建集合，使用遍历
 */
public class PokerDemo02 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        String[] colors = {"♦", "♣", "♥", "♠"};
        String[] num = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        //索引
        int index = 0;
        for (String n : num) {
            for (String c : colors) {
                hm.put(index, c + n);
                list.add(index);
                index++;
            }
        }
        index++;
        hm.put(index, "小王");
        list.add(index);

        index++;
        hm.put(index, "大王");
        list.add(index);
        //洗牌
        Collections.shuffle(list);
        TreeMap<Integer, String> one = new TreeMap<>();
        TreeMap<Integer, String> two = new TreeMap<>();
        TreeMap<Integer, String> third = new TreeMap<>();
        TreeMap<Integer, String> ed = new TreeMap<>();

        for (int i = 0; i < list.size(); i++) {
            Integer key = list.get(i);
            String s = hm.get(key);
            if (i > list.size() - 4) {
                ed.put(key, s);
            } else if (i % 3 == 0) {
                one.put(key, s);
            } else if (i % 3 == 1) {
                two.put(key, s);
            } else if (i % 3 == 2) {
                third.put(key, s);
            }

        }
        lookPoker("张三", one);
        lookPoker("李四", two);
        lookPoker("王五", third);
        lookPoker("底牌", ed);
    }

    public static void lookPoker(String name, TreeMap<Integer, String> treeMap) {
        System.out.println(name + "的牌是：");
        Collection<String> values = treeMap.values();
        for (String s : values) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
