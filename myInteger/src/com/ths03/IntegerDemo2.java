package com.ths03;
/*
    装箱：把基本数据类型转换为对应的包装类类型
    拆箱：把包装类类型转换为对应的基本数据类型
    自动装箱就是系统自动转换
 */
public class IntegerDemo2 {
    public static void main(String[] args) {
        Integer i=200;//自动装箱
        int i2=i+200;//自动拆箱
        i=null;
        if (i!=null){
            i+=100;
        }else {
            System.out.println("i为null");
        }

    }
}
