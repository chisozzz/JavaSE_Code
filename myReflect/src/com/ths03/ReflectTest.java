package com.ths03;
/*
练习1：通过反射实现如下操作
        Student s = new Student("林青霞",30,"西安");
        System.out.println(s);
*/

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("com.ths02.Student");
        Constructor<?> con = c.getConstructor(String.class, int.class, String.class);
        Object obj = con.newInstance("林青霞", 30, "西安");
        System.out.println(obj);
    }
}
