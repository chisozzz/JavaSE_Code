package com.ths04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("com.ths02.Student");
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
//        Field[] fields = c.getFields();
        Field[] fields = c.getDeclaredFields();
        for (Field field:fields){
            System.out.println(field);
        }
        System.out.println("--------");
        Field addressField = c.getField("address");
        addressField.set(obj,"西安");

        Field nameField = c.getDeclaredField("name");

    }
}
