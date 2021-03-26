package com.practice;

import java.util.ArrayList;
import java.util.Random;

/**
 * 练习ArrayList序列的基本操作，add、remove、set、get、创建序列对象
 */
public class Demo1 {
    public static void main(String[] args) {
        //创建序列，参数为泛型，引用数据类型
        ArrayList<String>array=new ArrayList<>();
        array.add("zhangsan");
        array.add("lisi");
        array.add("wangwu");
        array.remove("zhangsan");
        array.remove(0);
        //非0状态码表示异常终止，0表示正常终止
        System.exit(0);
        //遍历序列，通过索引获取每个元素，然后对他们操作
        for (int i = 0; i < array.size(); i++) {
            String name = array.get(i);
            System.out.println(name);
        }
        //Random类的练习
//        Random r=new Random();
//        int i = r.nextInt(100);
//        System.out.println(i);
    }
}
