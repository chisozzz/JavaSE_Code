package com.ths05;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
//        s.name ="zhan";private封装了Student类，无法直接使用
        s.setName("张三");
        s.setAge(12);
//        System.out.println(s.getName()+","+s.getAge());
        s.show();
    }
}
