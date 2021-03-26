package com.ths03;
/*
练习2：通过反射实现如下操作
        Student s = new Student("林青霞");
        System.out.println(s);
        public void setAccessible(boolean flag)：值为true，取消访问检查

*/

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectTest02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("com.ths02.Student");
        Constructor<?> con = c.getDeclaredConstructor(String.class);
        //public void setAccessible(boolean flag)：值为true，取消访问检查
        con.setAccessible(true);
        Object obj = con.newInstance("林青霞");
        System.out.println(obj);
    }
}
