package com.ths05;
/*
练习：通过反射实现如下操作
        Student s = new Student();
        s.method1();
        s.method2("林青霞");
        String ss = s.method3("林青霞",30);
        System.out.println(ss);
        s.function();
*/

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo02 {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException {
        Class<?> c = Class.forName("com.ths02.Student");
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        Method m1 = c.getMethod("method1");
        m1.invoke(obj);
        System.out.println("--------");
        Method m2 = c.getMethod("method2", String.class);
        m2.invoke(obj,"林青霞");
        System.out.println("--------");
        Method m3 = c.getDeclaredMethod("method3", String.class, int.class);
        Object o = m3.invoke(obj, "林青霞", 30);
        System.out.println(o);
        System.out.println("--------");
        Method m4 = c.getDeclaredMethod("function");
        m4.setAccessible(true);
        m4.invoke(obj);

    }
}
