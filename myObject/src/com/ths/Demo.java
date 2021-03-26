package com.ths;

public class Demo {
    public static void main(String[] args) {
        Student s = new Student("林青霞",30);
        Student s2 = new Student("林青霞", 30);
        System.out.println(s);
        System.out.println(s2);
        System.out.println(s.equals(s2));

    }
}
