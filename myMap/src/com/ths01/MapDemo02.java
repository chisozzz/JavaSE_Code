package com.ths01;

import java.util.HashMap;
import java.util.Map;

/*
    练习Map集合的常用方法
 */
public class MapDemo02 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("ths01","zhangsan");
        map.put("ths02","lisi");
        map.put("ths03","wangwu");

        //remove返回键值 键值不存在返回null
//        System.out.println(map.remove("ths01"));
//        System.out.println(map.remove("ths04"));

        //containKey返回boolean
//        System.out.println(map.containsKey("ths01"));
//        System.out.println(map.containsKey("ths04"));

        //clear清空
//        map.clear();

        //containValue返回boolean
//        System.out.println(map.containsValue("zhangsan"));
//        System.out.println(map.containsValue("zhaoliu"));

        //isEmpty
//        System.out.println(map.isEmpty());

        //size
        System.out.println(map.size());

        System.out.println(map);
    }
}
