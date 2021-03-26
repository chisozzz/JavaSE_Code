package com.ths03;

import java.util.ArrayList;

/*
    Stream<T> filter(Predicate predicate)：用于对流中的数据进行过滤
        Predicate接口中的方法	boolean test(T t)：对给定的参数进行判断，返回一个布尔值
    Stream<T> limit(long maxSize)：返回此流中的元素组成的流，截取前指定参数个数的数据
    Stream<T> skip(long n)：跳过指定参数个数的数据，返回由该流的剩余元素组成的流

 */
public class StreamOperatorDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张曼玉");
        list.add("张无忌");
        list.add("张敏");
        list.add("林青霞");
        list.add("风清扬");
        list.add("吴老");
        //将“张”开头的名字输出
        list.stream().filter(s -> s.startsWith("张")).forEach(System.out::println);
        System.out.println("--------");
        //将名字长度为3的姓名输出
        list.stream().filter(s -> s.length() == 3).forEach(System.out::println);
        System.out.println("--------");
        //将“张”开头和长度为3的名字输出
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(System.out::println);
        System.out.println("--------");
        //取前4个输出
        list.stream().limit(4).forEach(System.out::println);
        System.out.println("--------");
        //跳过2个输出后面的名字
        list.stream().skip(2).forEach(System.out::println);

    }
}
