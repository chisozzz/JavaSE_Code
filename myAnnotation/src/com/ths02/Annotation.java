package com.ths02;

import com.ths01.AnnotationDemo;
import com.ths01.Interface01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface Annotation {
        String name() default "zhangsan";
        int age();
//      Interface01 in();接口无效
//      AnnotationDemo i();类无效
//        pro p();//枚举
//        Annotation2 a();//注解
        String[] ss();
}
