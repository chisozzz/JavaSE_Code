package com.ths02;

import java.util.ArrayList;
import java.util.List;

/*
    测试:List的特有方法
    list有顺序的带索引
    元素可以重复
 */
public class ListTest {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("hello");
        list.add("world");

        //List带有索引，利用索引插入
        list.add(2,"java");

        //remove通过索引删除指定元素，返回被删除元素
//         System.out.println(list.remove(1));
//        list.remove(3);//IndexOutOfBoundsException

        //set修改指定索引处的元素，返回被修改的元素
//        System.out.println(list.set(1,"javase"));
//        list.set(3,"javaee");//IndexOutOfBoundsException

        //get返回指定索引的元素
//        System.out.println(list.get(1));
//        System.out.println(list.get(3));//IndexOutOfBoundsException

        //打印在控制台
        System.out.println(list);
    }
}
