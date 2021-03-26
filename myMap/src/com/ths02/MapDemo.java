package com.ths02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    map集合的遍历 通过键来找值
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String,String > map=new HashMap<>();
        map.put("ths01","zhangsan");
        map.put("ths02","lisi");
        map.put("ths03","wangwu");
        //获取所有的键
        Set<String> strings = map.keySet();
        //遍历所有的键
        for (String s:strings){
            //通过键找到值
            String s1 = map.get(s);
            System.out.println(s+","+s1);
        }

    }
}
