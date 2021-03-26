package com.ths03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    案例：HashMap集合存储自定义对象并遍历
    需求：创建一个HashMap集合，键是学号(String)，值是学生对象(Student)。存储三个键值对元素，并遍历
    思路：
        定义学生类
        创建HashMap集合对象
        创建学生对象
        把学生添加到集合
        遍历集合


 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Student> hm = new HashMap<>();
        Student s1 = new Student("zhangsan", 22);
        Student s2 = new Student("lisi", 26);
        Student s3 = new Student("wangwu", 21);

        hm.put("ths01",s1);
        hm.put("ths02",s2);
        hm.put("ths03",s3);

        Set<String> keySet = hm.keySet();
        for (String s:keySet){
            String name = hm.get(s).getName();
            int age = hm.get(s).getAge();
            System.out.println(s+","+name+","+age);
        }
        System.out.println("--------");
        Set<Map.Entry<String, Student>> entrySet = hm.entrySet();
        for (Map.Entry<String, Student>me:entrySet){
            String key = me.getKey();
            String name = me.getValue().getName();
            int age = me.getValue().getAge();
            System.out.println(key+","+name+","+age);
        }

    }
}
