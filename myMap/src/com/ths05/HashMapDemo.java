package com.ths05;

import java.util.*;

/*
    案例：统计字符串中每个字符出现的次数
    需求：键盘录入一个字符串，要求统计字符串中每个字符串出现的次数。
          举例：键盘录入“aababcabcdabcde”	在控制台输出：“a(5)b(4)c(3)d(2)e(1)”
    思路：
    键盘录入一个字符串
    创建HashMap集合，键是Character，值是Integer
    遍历字符串，得到每一个字符
    拿得到的每一个字符作为键到HashMap集合中去找对应的值，看其返回值
        如果返回值是null：说明该字符在HashMap集合中不存在，就把该字符作为键，1作为值存储
        如果返回值不是null：说明该字符在HashMap集合中存在，把该值加1，然后重新存储该字符和对应的值
    遍历HashMap集合，得到键和值，按照要求进行拼接
    输出结果

 */
public class HashMapDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();
//        HashMap<Character, Integer> hm = new HashMap<>();
        //自然顺序
        TreeMap<Character, Integer> hm = new TreeMap<>();
        for (int i = 0; i < line.length(); i++) {
            char key = line.charAt(i);
            Integer value = hm.get(key);
            if (value==null){
                hm.put(key,1);
            }else {
                value++;
                hm.put(key,value);
            }
        }
        StringBuilder sb=new StringBuilder();
        Set<Map.Entry<Character, Integer>> entrySet = hm.entrySet();
        for (Map.Entry<Character, Integer>me:entrySet){
            Character key = me.getKey();
            Integer value = me.getValue();
            sb.append(key).append("(").append(value).append(")");
        }
        String s = sb.toString();
        System.out.println(s);
    }
}
