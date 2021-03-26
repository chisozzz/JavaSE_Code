package com.ths05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    案例：HashMap集合存储ArrayList元素并遍历
    需求：创建一个HashMap集合，它包含三个元素，每一个元素都是ArrayList类型的。
          每一个ArrayList的元素是String类型的
    思路：
    创建HashMap集合
    创建ArrayList集合，并添加元素
    把ArrayList添加到HashMap
    遍历HashMap

 */
public class HashMapIncludeArrayListDemo {
    public static void main(String[] args) {
        HashMap<ArrayList<String>, ArrayList<String>> hm = new HashMap<>();
        ArrayList<String> arrayKey = new ArrayList<>();
        ArrayList<String> arrayValue = new ArrayList<>();
        arrayKey.add("ths01");
        arrayValue.add("zhangsan");
        hm.put(arrayKey,arrayValue);

        ArrayList<String> arrayKey2 = new ArrayList<>();
        ArrayList<String> arrayValue2 = new ArrayList<>();
        arrayKey.add("ths02");
        arrayValue.add("lisi");
        hm.put(arrayKey2,arrayValue2);

        ArrayList<String> arrayKey3 = new ArrayList<>();
        ArrayList<String> arrayValue3 = new ArrayList<>();
        arrayKey.add("ths03");
        arrayValue.add("wangwu");
        hm.put(arrayKey3,arrayValue3);

        Set<Map.Entry<ArrayList<String>, ArrayList<String>>> entrySet = hm.entrySet();
        for (Map.Entry<ArrayList<String>, ArrayList<String>>me:entrySet){
            ArrayList<String> key = me.getKey();
            ArrayList<String> value = me.getValue();
            for (String s:key){
                System.out.println(s);
            }
            for (String s:value){
                System.out.println(s);
            }
        }
    }
}
