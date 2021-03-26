package com.Reflect;

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 不改变下面代码，只修改配置文件，创建对象，调用方法，使用反射完成
 */
public class Practice {
    public static void main(String[] args)throws Exception {
        //Properties集合读取配置文件中的类名和方法名
        Properties prop=new Properties();
        FileReader fr=new FileReader("myPracticeAllDemo\\src\\com\\Reflect\\class.txt");
        prop.load(fr);
        String className = prop.getProperty("className");
        String classMethod = prop.getProperty("classMethod");
        //反射实现类对象的创建和方法调用
        Class<?> c = Class.forName(className);
        Constructor<?> con = c.getConstructor();
        Object s = con.newInstance();
        Method method = c.getMethod(classMethod);
        method.invoke(s);
    }
}
