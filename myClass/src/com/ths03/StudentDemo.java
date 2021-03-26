package com.ths03;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s);

        s.show();

        s.name ="林青霞";
        s.age = 30;
        s.show();
        s.study();
        s.doHomework();

    }
}
