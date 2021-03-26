package com.ths01;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        //Calendar实例化对象
        Calendar c = Calendar.getInstance();
//        int i = c.get(Calendar.YEAR);
//        System.out.println(i);
        //返回指定日历字段的int，MOUTH的值为现实-1值
        int year = c.get(Calendar.YEAR);
        int mouth = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
        int sencond = c.get(Calendar.SECOND);
        System.out.println(year + "年" + mouth + "月" + date + "日 "+hour+"时"+minute+"分"+sencond+"秒");
        //三年前的今天
//        c.add(Calendar.YEAR, -3);
//        int year = c.get(Calendar.YEAR);
//        int mouth = c.get(Calendar.MONTH) + 1;
//       int date = c.get(Calendar.DATE);
//        System.out.println(year + "年" + mouth + "月" + date + "日");
        //十年后的三天前
//        c.add(Calendar.YEAR,10);
//        c.add(Calendar.DATE,-3);
//        int year = c.get(Calendar.YEAR);
//        int mouth = c.get(Calendar.MONTH) + 1;
//        int date = c.get(Calendar.DATE);
//        System.out.println(year + "年" + mouth + "月" + date + "日");

//        c.set(2020,11,30);
//        //Calendar的时间字段、Year，Mouth
//        int year = c.get(Calendar.YEAR);
//        int mouth = c.get(Calendar.MONTH) + 1;
//        int date = c.get(Calendar.DATE);
//        System.out.println(year + "年" + mouth + "月" + date + "日");

    }
}
