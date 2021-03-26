package com.ths07;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Student> ts  = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num=s1.getAge()-s2.getAge();
                int num2=num==0?s1.getName().compareTo(s2.getName()):num;
                return num2;
            }
        });

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
