package com.ths05;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    工具类Collectors提供了具体的收集方式
    public static <T> Collector toList()：把元素收集到List集合中
    public static <T> Collector toSet()：把元素收集到Set集合中
    public static  Collector toMap(Function keyMapper,Function valueMapper)：把元素收集到Map集合中

 */
public class StreamCollector {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("林青霞");
        list.add("王祖贤");
        list.add("张曼玉");
        list.add("柳岩");
//        Stream<String> listStream = list.stream().filter(s -> s.length() == 3);
//        List<String> names = listStream.collect(Collectors.toList());
//        for (String name:names){
//            System.out.println(name);
//        }
        Set<Integer>set=new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
//        Stream<Integer> setStream = set.stream().filter(integer -> integer > 25);
//        Set<Integer> ages = setStream.collect(Collectors.toSet());
//        for (int age:ages){
//            System.out.println(age);
//        }
        String[]strArray={"林青霞,30","张曼玉,32","王祖贤,31","貂蝉,28","柳岩,33"};
        Stream<String> strStream = Stream.of(strArray).filter(s -> Integer.parseInt(s.split(",")[1]) > 30);
        Map<String, Integer> map = Stream.of(strArray).collect(Collectors.toMap(s -> s.split(",")[0], s -> Integer.parseInt(s.split(",")[1])));
        Set<String> names = map.keySet();
        for (String  name:names){
            Integer age = map.get(name);
            System.out.println(name+","+age);
        }
    }
}
