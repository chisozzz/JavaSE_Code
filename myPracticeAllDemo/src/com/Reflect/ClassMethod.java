package com.Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 练习获取反射类成员方法和放射方法的使用
 */
public class ClassMethod {
    public static void main(String[] args) throws Exception {

        //反射类
        Class<?> c = Class.forName("com.Reflect.Student");

        //反射的构造方法
        Constructor<?> con = c.getConstructor();
        Object s = con.newInstance();

        //反射的成员方法
        Method setName = c.getMethod("setName", String.class);
        setName.invoke(s,"zhangsan");

//        System.out.println(s);
        Method setAge = c.getMethod("setAge", int.class);
        setAge.invoke(s,22);

        Method setAddress = c.getMethod("setAddress", String.class);
        setAddress.invoke(s,"西安");

        System.out.println(s);
    }
}
