package com.ths02;

import java.util.ArrayList;

/*
    1.3 ArrayList集合常用方法

 */
public class arrayListDemo {
    public static void main(String[] args) {
        ArrayList<String>array=new ArrayList<>();
        array.add("张三");
        array.add("李四");
        array.add("王五");
//        System.out.println(array);

        //根据元素remove删除元素
//        System.out.println(array.remove("李四"));
        //删除失败
//        System.out.println(array.remove("zhangsan"));

        //根据索引删除元素
//        array.remove(1);

//        IndexOutOfBoundsException
//        array.remove(3);

        //修改指定索引的元素
//        array.set(1,"lisi");

        //IndexOutOfBoundsException
//        array.set(3,"wangwu");

        System.out.println(array.size());
        System.out.println(array);
    }
}
