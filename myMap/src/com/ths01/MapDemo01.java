package com.ths01;

import java.util.HashMap;
import java.util.Map;

/*
    map集合的概述
    Map<K,V>集合名;K是键的泛型，V是值的泛型，每个键最多只有一个值，每个键都不相同
 */
public class MapDemo01 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("ths01","zhangsan");
        map.put("ths02","lisi");
        map.put("ths03","wangwu");
        //相同的键重复出现，put会修改键的值
        map.put("ths03","zhaoliu");


        System.out.println(map);//HashMap对toString方法重写了
    }
}
