package com.ths03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    案例：日期工具类
    需求：定义一个日期工具类(DateUtils)，包含两个方法：把日期转换为指定格式的字符串；
    把字符串解析为指定格式的日期，然后定义一个测试类(DateDemo)，测试日期工具类的方法

 */
public class DateUtils {
    private DateUtils(){}
    public static String dateToString(Date date){
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s=sdf.format(date);
        return s;
    }
    public static Date stringToDate(String s) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date=sdf.parse(s);
        return date;

    }
}
