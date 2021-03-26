package com.ths01;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        //创建collection对象
        Collection<String>c =new ArrayList<>();

        //向c添加元素
        c.add("hello");
        c.add("world");
        c.add("java");

        //remove删除相同元素返回boolean
//        System.out.println(c.remove("javase"));
//        System.out.println(c.remove("java"));

        //clear清空集合void
//        c.clear();

        //contains比较元素是否相同，返回boolean
//        System.out.println(c.contains("hello"));
//        System.out.println(c.contains("javase"));

        //isEmpty判断集合是否为空返回Boolean
//        System.out.println(c.isEmpty());

        System.out.println(c.size());
        //输出c，可以知道ArrayList重写了toString方法
        System.out.println(c);

    }
}
