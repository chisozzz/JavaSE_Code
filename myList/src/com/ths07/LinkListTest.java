package com.ths07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkListTest {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();
        Student s1 = new Student("zhangsan", 22);
        Student s2 = new Student("lisi", 26);
        Student s3 = new Student("wangwu", 24);


        array.add(s1);
        array.add(s2);
        array.add(s3);

        Iterator<Student> it = array.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s);
        }
        System.out.println("--------");

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s);
        }
        System.out.println("--------");
        for (Student s : array) {
            System.out.println(s);

        }
        System.out.println("--------");

        LinkedList<Student> linkedList = new LinkedList<>();
        linkedList.add(s1);
        linkedList.add(s2);
        linkedList.add(s3);
        Iterator<Student> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            System.out.println(s);
        }
        System.out.println("--------");
        for (int i = 0; i < linkedList.size(); i++) {
            Student s = linkedList.get(i);
            System.out.println(s);
        }
        System.out.println("--------");
        for (Student s : linkedList) {
            System.out.println(s);
        }
//        System.out.println("--------");
    }
}
