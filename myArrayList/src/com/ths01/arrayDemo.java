package com.ths01;

import java.util.ArrayList;

/*
    1.2 ArrayList构造方法和添加方法
    ArrayList<>();
    add();

 */
public class arrayDemo {
    public static void main(String[] args) {
        ArrayList<String> array =new ArrayList<>();
        array.add("hello");
        array.add("world");
        array.add("java");
//        System.out.println("array:"+array);

//        array.add(1,"javase");
//        array.add(3,"javase");
        //IndexOutOfBoundsException
//        array.add(4,"javase");
        System.out.println("array:"+array);


    }
}
