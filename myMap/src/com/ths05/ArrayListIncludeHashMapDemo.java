package com.ths05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    案例：ArrayList集合存储HashMap元素并遍历
    需求：创建一个ArrayList集合，它包含三个元素，每一个元素都是HashMap类型的。
          每一个HashMap的键和值都是String类型的
    思路：
    创建ArrayList集合
    创建HashMap集合，并添加键值对对象
    把HashMap添加到ArrayList
    遍历ArrayList

 */
public class ArrayListIncludeHashMapDemo {
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> array = new ArrayList<>();
        HashMap<String, String> hm = new HashMap<>();
        hm.put("ths01", "zhangsan");
        HashMap<String, String> hm2 = new HashMap<>();
        hm2.put("ths02", "lisi");
        HashMap<String, String> hm3 = new HashMap<>();
        hm3.put("ths03", "wangwu");
        array.add(hm);
        array.add(hm2);
        array.add(hm3);

        for (HashMap<String, String>hms:array){
            Set<Map.Entry<String, String>> entrySet = hms.entrySet();
            for (Map.Entry<String, String>me:entrySet){
                System.out.println(me.getKey()+","+me.getValue());
            }
        }

    }
}
