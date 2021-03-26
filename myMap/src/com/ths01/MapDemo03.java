package com.ths01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo03 {
    public static void main(String[] args) {
        Map<String,String >map=new HashMap<>();
        map.put("ths01","zhangsan");
        map.put("ths02","lisi");
        map.put("ths03","wangwu");

        //get根据键获取值
//        System.out.println(map.get("ths01"));
//        System.out.println(map.get("ths04"));

        //keySet获取所有键，返回到一个Set集合,键不能重复
//        Set<String> s = map.keySet();
//        for (String s1:s){
//            System.out.println(s1);
//        }

        //values获取所有值，返回到一个collection集合
        Collection<String> values = map.values();
        for (String s1:values){
            System.out.println(s1);
        }
        System.out.println(map);
    }
}
