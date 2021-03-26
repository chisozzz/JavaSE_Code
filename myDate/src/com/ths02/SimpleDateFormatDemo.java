package com.ths02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        //format格式化日期为字符串
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d = new Date();
        String s = sdf.format(d);
        System.out.println(s);
        //将字符串解析为Date类
        String ss="2020-01-10 11:12:30";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dd=sdf2.parse(ss);
        System.out.println(dd);

        SimpleDateFormat sdf3=new SimpleDateFormat("yyyy年MM月dd日");
        String s1 = sdf3.format(d);
        System.out.println(s1);
    }
}
