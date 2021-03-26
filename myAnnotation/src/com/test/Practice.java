package com.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 解析注解步骤：
 * 1. 获取注解定义的位置的对象  （Class，Method,Field）
 * 		2. 获取指定的注解
 * 			* getAnnotation(Class)
 * 			//其实就是在内存中生成了一个该注解接口的子类实现对象
 *
 * 		            public class ProImpl implements Pro{
 * 		                public String className(){
 * 		                    return "cn.itcast.annotation.Demo1";
 *                                                }
 * 		                public String methodName(){
 * 		                    return "show";
 *                                            }
 * 		            }
 * 		3. 调用注解中的抽象方法获取配置的属性值
 */
@Annotation(className = "com.test.Teacher",classMethod = "teach")
public class Practice {

    public static void main(String[] args)throws Exception {
        //反射获取practice类
        Class<Practice> practiceClass = Practice.class;
        //getAnnotation获取类的注解
        Annotation an = practiceClass.getAnnotation(Annotation.class);
        //通过注解调用方法
        String className = an.className();
        String classMethod = an.classMethod();

        Class<?> c = Class.forName(className);
        Constructor<?> con = c.getConstructor();
        Object s = con.newInstance();
        Method study = c.getMethod(classMethod);
        study.invoke(s);
    }
}
