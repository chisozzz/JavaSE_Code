package com.ths05;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

//练习1：我有一个ArrayList<Integer>集合，现在我想在这个集合中添加一个字符串数据，如何实现？
public class ReflectTest01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer>array=new ArrayList<>();

        Class<? extends ArrayList> c = array.getClass();
//        Method m = c.getMethod("add", Object.class);
        Method m = c.getMethod("add", Object.class);
        m.invoke(array,"hello");
        m.invoke(array,"java");
        m.invoke(array,"world");
        System.out.println(array);
    }
}
