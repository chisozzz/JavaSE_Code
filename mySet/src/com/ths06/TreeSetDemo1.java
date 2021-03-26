package com.ths06;

import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();
        Student s1 = new Student("zhangsan", 25);
        Student s2 = new Student("lisi", 23);
        Student s3 = new Student("wangwu", 22);
        Student s4 = new Student("zhaoliu", 26);
        Student s5 = new Student("aming", 26);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        for (Student s:ts){
            System.out.println(s);
        }

    }
}
