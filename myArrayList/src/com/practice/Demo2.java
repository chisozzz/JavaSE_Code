package com.practice;



import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        Studnet s1=new Studnet();
        Studnet s2=new Studnet();
        s1.setName("zhangsan");
        s2.setName("lisi");
        s1.setAge(23);
        s2.setAge(21);
        ArrayList<Studnet>array=new ArrayList<>();
        array.add(s1);
        array.add(s2);
        for (Studnet studnet : array) {
            System.out.println(studnet.getName()+","+studnet.getAge());
        }
    }
}
