package com.ths05;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

//练习2：通过配置文件运行类中的方法
public class ReflectTest02 {
    public static void main(String[] args) throws IOException, InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchMethodException, ClassNotFoundException {
        //Properties集合读取流的键值对，用等号连接
        Properties prop=new Properties();
        FileReader fr=new FileReader("myReflect\\class.txt");
        prop.load(fr);
        fr.close();

        String className = prop.getProperty("className");
        String methodName = prop.getProperty("methodName");
        Class<?> c = Class.forName(className);
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        Method method = c.getMethod(methodName);
        method.invoke(obj);

    }
}
