package com.ths03;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
    static <T> Stream<T> concat(Stream a, Stream b)：合并a和b两个流为一个流
    Stream<T> distinct()：返回由该流的不同元素（根据Object.equals(Object) ）组成的流

 */
public class StreamOperatorDemo01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张曼玉");
        list.add("张无忌");
        list.add("张敏");
        list.add("林青霞");
        list.add("风清扬");
        list.add("吴老");
        //取前4个创建流
        Stream<String> stream1 = list.stream().limit(4);
        //跳过2个创建流
        Stream<String> stream2 = list.stream().skip(2);
        //合并2个流为一个,输出
//        Stream.concat(stream1,stream2).forEach(System.out::println);
        //合并两个流同时去除相同的元素
        Stream.concat(stream1,stream2).distinct().forEach(System.out::println);
    }
}
