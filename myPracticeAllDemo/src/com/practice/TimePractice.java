package com.practice;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Arrays;
import java.util.Scanner;

public class TimePractice {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        date=date.withDayOfMonth(1);
        date=date.minusDays(1);
        System.out.println(date.lengthOfMonth());
        LocalTime time = LocalTime.now();
        System.out.println(time.getHour());
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        /*
        * 使用DateTimeFormatter.ofLocalizedDateTime方式进行格式化，选择FormatStyle.MEDIUM 较好*/
        DateTimeFormatter dtf1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        //自定义格式化的方式ofPattern，填入格式
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String s = dtf1.format(dateTime);
        TemporalAccessor parse = dtf1.parse(s);
        String format = dtf1.format(parse);
        System.out.println(format);
        Instant star = Instant.now();//伦敦时间,
        long l = star.toEpochMilli();
        System.out.println(l);
    }
}
