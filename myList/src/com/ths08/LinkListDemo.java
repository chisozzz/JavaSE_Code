package com.ths08;
/*
    练习Linklist的常用方法
    addFirst,addLast在链表头部和尾部添加元素
    getFirst,getLast返回头部和尾部
    removeFirst,removeLast删除并返回头部和尾部元素
 */
import java.util.LinkedList;

public class LinkListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");

        //addFirst,addLast在链表头部和尾部添加元素
//        linkedList.addFirst("javase");
//        linkedList.addLast("javaee");

        //getFirst,getLast返回头部和尾部
//        System.out.println(linkedList.getFirst());
//        System.out.println(linkedList.getLast());

        //removeFirst,removeLast删除并返回头部和尾部元素
//        System.out.println(linkedList.removeFirst());
//        System.out.println(linkedList.removeLast());

        System.out.println(linkedList);

    }
}
