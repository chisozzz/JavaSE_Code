package com.ths05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Student>list=new ArrayList<>();
        Student s1 = new Student("zhangsan", 22);
        Student s2 = new Student("lisi", 25);
        Student s3 = new Student("wangwu", 36);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        //迭代器遍历
        Iterator<Student> it = list.iterator();
        while (it.hasNext()){
            Student next = it.next();
            System.out.println(next);
        }

        //普通for遍历
        System.out.println("--------");
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println(student);
        }

        //增强for遍历
        System.out.println("--------");
        for (Student i:list){
            System.out.println(i);
        }
    }
}
