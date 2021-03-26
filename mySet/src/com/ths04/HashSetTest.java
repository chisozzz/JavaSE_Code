package com.ths04;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Student>hs =new HashSet<>();
        Student s1=new Student("zhangsan",22);
        Student s2=new Student("lisi",23);
        Student s3=new Student("wangwu",25);
        Student s4=new Student("wangwu",25);

        hs.add(s4);
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        for (Student s:hs){
            System.out.println(s);
        }

    }
}
