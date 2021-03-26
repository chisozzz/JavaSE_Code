package com.ths02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*
    Map集合遍历2，利用映射关系遍历，一对关系获取键和值
 */
public class MapDemo02 {
    public static void main(String[] args) {
        Map<String,String > map=new HashMap<>();
        map.put("ths01","zhangsan");
        map.put("ths02","lisi");
        map.put("ths03","wangwu");

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String,String>me:entrySet){
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key+","+value);
        }
    }
}
