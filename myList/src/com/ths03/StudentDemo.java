package com.ths03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentDemo {
    public static void main(String[] args) {
        List<Student>list=new ArrayList<>();
        Student s1 = new Student("zhangsan", 12);
        Student s2 = new Student("lisi", 18);
        Student s3 = new Student("wangwu", 22);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        //迭代器遍历
        Iterator<Student> it = list.iterator();
        while (it.hasNext()){
            Student s = it.next();
            System.out.println(s);
        }

        //for循环索引遍历
        for (int i=0;i<list.size();i++){
            Student student = list.get(i);
            System.out.println(student);
        }
    }
}
