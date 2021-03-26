package com.ths04;

import java.util.ArrayList;
import java.util.Collections;

/*
    案例：模拟斗地主
    需求：通过程序实现模拟斗地主过程中的发牌和看牌
    思路：
    创建一个牌盒，也就是定义一个集合对象，用ArrayList集合实现
    往牌盒里面装牌
    洗牌，也就是把牌打撒，用Collections的shuffle()方法实现
    发牌，也就是遍历集合，给三个玩家发牌
    看牌，也就是三个玩家分别遍历自己的牌

 */
public class PokerDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        /*
            花色：♦ ♣ ♥ ♠
            数字：2 3 ...K A
            大王 小王
         */
        String[]colors={"♦","♣","♥","♠"};
        String[]num={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        for (String color:colors){
            for (String n:num){
                array.add(color+n);
            }
        }
        array.add("大王");
        array.add("小王");
//
        Collections.shuffle(array);
//        System.out.println(array.size());

        ArrayList<String> onePoker = new ArrayList<>();
        ArrayList<String> twoPoker = new ArrayList<>();
        ArrayList<String> thirdPoker = new ArrayList<>();
        ArrayList<String> edPoker = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            String poker = array.get(i);
            if (i>array.size()-4){
                edPoker.add(poker);
            }else if(i%3==0){
                onePoker.add(poker);
            }else if(i%3==1){
                twoPoker.add(poker);
            }else if(i%3==2){
                thirdPoker.add(poker);
            }

        }
        lookPoker("张三",onePoker);
        lookPoker("李四",twoPoker);
        lookPoker("王五",thirdPoker);
        lookPoker("底牌",edPoker);
    }

    public static void lookPoker(String name,ArrayList<String>array){
        System.out.println(name+"的牌是：");
        for (String s:array){
            System.out.print(s+" ");
        }
        System.out.println();
    }
}
