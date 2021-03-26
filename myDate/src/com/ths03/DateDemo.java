package com.ths03;

import java.text.ParseException;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        String s=DateUtils.dateToString(d);
        System.out.println(s);
        System.out.println("--------");
        String ss="2020-11-22 8:46:33";
        Date dd=DateUtils.stringToDate(ss);
        System.out.println(dd);

    }
}
