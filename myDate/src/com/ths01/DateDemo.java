package com.ths01;

import java.util.Date;

/*
    测试类：Date构造方法
 */
public class DateDemo {
    public static void main(String[] args) {
    //无参构造方法，现在的时间
        Date d = new Date();
        System.out.println(d);
        //有参数构造方法
        System.out.println("--------");
        Date dd = new Date(1000 * 60 * 60);//中国为东八区 +8
        System.out.println(dd);
        System.out.println("--------");
        System.out.println((d.getTime()/1000/60/60/24/365)+"年");//冲1970 1 1算起
        d.setTime(1000*60*60);//给的是毫秒值
        System.out.println(d);
    }
}
