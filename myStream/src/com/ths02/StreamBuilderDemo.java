package com.ths02;

import java.util.*;
import java.util.stream.Stream;

/*
    Stream流的常见生成方式
    Collection体系的集合可以使用默认方法stream()生成流
        default Stream<E> stream()
    Map体系的集合间接的生成流
    数组可以通过Stream接口的静态方法of(T... values)生成流

 */
public class StreamBuilderDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Stream<String> listStream = list.stream();

        Set<String> set=new HashSet<>();
        Stream<String> setStream = set.stream();

        Map<String,Integer>map=new HashMap<>();
        Stream<String> keyStream = map.keySet().stream();
        Stream<Integer> valuesStream = map.values().stream();
        Stream<Map.Entry<String, Integer>> entryStream = map.entrySet().stream();

        String[]strArray={"hello","world","java"};
        Stream<String> strArrayStream = Stream.of(strArray);
        Stream<String> strArraySteam2 = Stream.of("hello", "world", "java");
        Stream<Integer> intStream = Stream.of(10, 20, 30);
    }
}
