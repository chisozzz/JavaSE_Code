package com.ths01;

/**
 * 注解的普通练习
 */
public class AnnotationDemo {
    /**
     * 两个整数相加
     * @param a 整数
     * @param b 整数
     * @return 两数之和
     */
    @Deprecated
    public static int add( int a ,int b){
        return a+b;
    }
    public static int add2(){
        return 11;
    }


}
