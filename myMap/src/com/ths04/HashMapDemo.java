package com.ths04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    案例：HashMap集合存储自定义对象并遍历
    需求：创建一个HashMap集合，键是学生对象(Student)，值是居住地 (String)。存储四个键值对元素，并遍历。
          要求保证键的唯一性：如果学生对象的成员变量值相同，我们就认为是同一个对象

    思路：
        定义学生类
        创建HashMap集合对象
        创建学生对象
        把学生添加到集合
        遍历集合
        在学生类中重写两个方法 hashmap集合由哈希表判断值不同，只需要重写
            hashCode()
            equals()
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Student, String> hm = new HashMap<>();
        Student s1 = new Student("zhangsan", 22);
        Student s2 = new Student("lisi", 26);
        Student s3 = new Student("wangwu", 21);

        hm.put(s1, "西安");
        hm.put(s2, "广州");
        hm.put(s3, "福建");
        hm.put(s3, "北京");

        Set<Student> keySet = hm.keySet();
        for (Student s : keySet) {
            String name = s.getName();
            int age = s.getAge();
            String adress = hm.get(s);
            System.out.println(name + "," + age + "," + adress);
        }
        System.out.println("--------");

        Set<Map.Entry<Student, String>> entrySet = hm.entrySet();
        for (Map.Entry<Student, String> me : entrySet) {
            Student key = me.getKey();
            String value = me.getValue();
            String name = key.getName();
            int age = key.getAge();
            System.out.println(name + "," + age + "," + value);
        }

    }
}
