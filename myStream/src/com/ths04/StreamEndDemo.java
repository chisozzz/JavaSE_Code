package com.ths04;

import java.util.ArrayList;

public class StreamEndDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张曼玉");
        list.add("张无忌");
        list.add("张敏");
        list.add("林青霞");
        list.add("风清扬");
        list.add("吴老");
        list.stream().forEach(System.out::println);
        long count = list.stream().filter(s -> s.startsWith("张")).count();
        System.out.println(count);
    }
}
