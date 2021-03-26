package com.ths04;
/*
    多个对象使用内存图（指向同一个内存）
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s =new Student();
        s.name="张三";
        s.age=22;
        s.show();
        s.study();
        s.doHomework();

        Student s2=s;
        s2.name="王五";
        s2.age=23;
        s.show();
        s2.show();
    }
}
