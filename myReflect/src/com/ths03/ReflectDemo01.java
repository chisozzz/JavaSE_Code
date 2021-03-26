package com.ths03;
/*
    Constructor<?>[] getConstructors()：返回所有公共构造方法对象的数组
    Constructor<?>[] getDeclaredConstructors()：返回所有构造方法对象的数组
    Constructor<T> getConstructor(Class<?>... parameterTypes)：返回单个公共构造方法对象
    Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)：返回单个构造方法对象
*/

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("com.ths02.Student");
        //获得所有公共构造方法
        Constructor<?>[] cons = c.getConstructors();
        for (Constructor con:cons){
            System.out.println(con);
        }
        System.out.println("--------");
        //获得所有的构造方法
        Constructor<?>[] cons2 = c.getDeclaredConstructors();
        for (Constructor con:cons2){
            System.out.println(con);
        }
        //获得单个公共构造方法,需要添加参数
        Constructor<?> con = c.getConstructor();
//        System.out.println(con);
        //获得单个构造方法
        Constructor<?> con2 = c.getDeclaredConstructor();
        System.out.println("--------");
        Object obj = con.newInstance();
        System.out.println(obj);
    }
}
