package com.ths05;
/*
Class类中用于获取成员方法的方法
        Method[] getMethods()：返回所有公共成员方法对象的数组，包括继承的
        Method[] getDeclaredMethods()：返回所有成员方法对象的数组，不包括继承的
        Method getMethod(String name, Class<?>... parameterTypes) ：返回单个公共成员方法对象
        Method getDeclaredMethod(String name, Class<?>... parameterTypes)：返回单个成员方法对象
*/

import java.lang.reflect.Method;

public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class<?> c = Class.forName("com.ths02.Student");
//        Method[] m1 = c.getMethods();
        Method[] m1 = c.getDeclaredMethods();
        for (Method m:m1){
            System.out.println(m);
        }
        System.out.println("--------");
        Method m2 = c.getMethod("method1");
        Method m3 = c.getDeclaredMethod("method2", String.class);
    }
}
