package com.ths04;

import java.util.*;

/*
    案例：模拟斗地主升级版
    需求：通过程序实现模拟斗地主过程中的发牌和看牌
    思路：
    创建一个牌盒，也就是定义一个集合对象，用HashMap集合实现
    往牌盒里面装牌
    洗牌，也就是把牌打撒，用Collections的shuffle()方法实现
    发牌，也就是遍历集合，给三个玩家发牌
    看牌，也就是三个玩家分别遍历自己的牌

 */
public class PokerDemo01 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        ArrayList<String> array = new ArrayList<>();
        /*
            花色：♦ ♣ ♥ ♠
            数字：2 3 ...K A
            大王 小王
         */
        String[] colors = {"♦", "♣", "♥", "♠"};
        String[] num = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
//        for (String color:colors){
//            for (String n:num){
//                array.add(color+n);
//            }
//        }
        for (String n : num) {
            for (String color : colors) {
                array.add(color + n);
            }
        }
        array.add("小王");
        array.add("大王");
        for (int i = 0; i < array.size(); i++) {
            hm.put(array.get(i), i);
        }
//
        Collections.shuffle(array);

//System.out.println(array);

//        ArrayList<String> onePoker = new ArrayList<>();
//        ArrayList<String> twoPoker = new ArrayList<>();
//        ArrayList<String> thirdPoker = new ArrayList<>();
//        ArrayList<String> edPoker = new ArrayList<>();
        TreeMap<Integer, String> oneTm = new TreeMap<>();
        TreeMap<Integer, String> twoTm = new TreeMap<>();
        TreeMap<Integer, String> thirdTm = new TreeMap<>();
        TreeMap<Integer, String> edTm = new TreeMap<>();

//        for (int i = 0; i < array.size(); i++) {
//            String poker = array.get(i);
//
//            if (i > array.size() - 4) {
//                edTm.put(hm.values(poker),poker);
//            } else if (i % 3 == 0) {
//                onePoker.add(poker);
//            } else if (i % 3 == 1) {
//                twoPoker.add(poker);
//            } else if (i % 3 == 2) {
//                thirdPoker.add(poker);
//            }
//
//        }


        for (int i = 0; i < array.size(); i++) {
            String s = array.get(i);
            Integer number = hm.get(s);
            if (i > array.size() - 4) {
                edTm.put(number, s);
            }else if(i%3==0){
                twoTm.put(number,s);
            }else if(i%3==1){
                thirdTm.put(number,s);
            }else if(i%3==2){
                oneTm.put(number,s);
            }

        }
        lookPoker("张三", oneTm);
        lookPoker("李四", twoTm);
        lookPoker("王五", thirdTm);
        lookPoker("底牌", edTm);
    }

    public static void lookPoker(String name, TreeMap<Integer, String> array) {
        Collection<String> values = array.values();
        System.out.println(name + "的牌是：");
        for (String i:values){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}