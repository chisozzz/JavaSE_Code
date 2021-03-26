package com.ths04;
/*
    多个对象的内存图（对象不同）
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        Student s2 = new Student();

        s.name="林青霞";
        s.age=30;
        s.show();
        s.study();
        s.doHomework();

        s2.name="张曼玉";
        s2.age = 18;
        s2.show();
        s2.study();
        s2.doHomework();
    }
}
