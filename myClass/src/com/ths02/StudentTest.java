package com.ths02;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.name ="张三";
        s.age = 12;
//        System.out.println(s.name +","+ s.age);
        s.show();
        s.study();
        s.doHomework();

    }
}
