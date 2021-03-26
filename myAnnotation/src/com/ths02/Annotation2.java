package com.ths02;

import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})//注解位置
@Retention(RetentionPolicy.RUNTIME)//保留的时期
@Documented
//@Inherited 描述注解是否被子类继承
public @interface Annotation2 {
    int value();
}
