package com.Reflect;

public class ReflectGet {
    public static void main (String[] args) throws Exception {
        //通过类获取反射类, .class解释时创建
        Class<Student> c1 = Student.class;

        //通过对象获取反射类,Runtime时创建
        Student s=new Student();
        Class<? extends Student> c2 = s.getClass();

        //通过源文件获取反射类，源文件时创建
        Class<?> c3 = Class.forName("com.Reflect.Student");

    }
}
