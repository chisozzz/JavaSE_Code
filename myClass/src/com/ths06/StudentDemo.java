package com.ths06;

public class StudentDemo {
    public static void main(String[] args) {
        Student s =new Student();
        s.setName("zhangsan");
        s.setAge(12);
        s.show();

        Student s2 = new Student("zhangsan");
        s2.show();

        Student s3 = new Student(12);
        s3.show();

        Student s4 = new Student("zhangsan",12);
        s4.show();
    }
}
