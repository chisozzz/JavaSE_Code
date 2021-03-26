package com.Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * 练习获取反射类的成员变量
 */
public class ClassFiled {
    public static void main(String[] args) throws Exception{
        //通过源文件获取反射类
        Class<?> c = Class.forName("com.Reflect.Student");
        //通过反射类获取构造方法对象
        Constructor<?> con = c.getConstructor();
        //通过构造方法对象创建学生对象/实例
        Object s = con.newInstance();
        //通过反射类获取成员变量
        Field name = c.getDeclaredField("name");
        //set赋值
        name.set(s,"zhangsan");
        //通过反射类获取成员变量
        Field age = c.getField("age");
        age.set(s,22);
        //通过反射类获取成员变量
        Field address = c.getField("address");
        address.set(s,"西安");

    }
}
