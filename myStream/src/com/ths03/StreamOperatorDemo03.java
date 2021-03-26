package com.ths03;

import java.util.ArrayList;
import java.util.List;

/*
    <R> Stream<R> map(Function mapper)：返回由给定函数应用于此流的元素的结果组成的流
        Function接口中的方法		R apply(T t)
    IntStream mapToInt(ToIntFunction mapper)：返回一个IntStream其中包含将给定函数应用于此流的元素的结果
        IntStream：表示原始 int 流
        ToIntFunction接口中的方法	 int applyAsInt(T value)

 */
public class StreamOperatorDemo03 {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("10");
        list.add("20");
        list.add("30");
        list.add("40");
        list.add("50");
        //使用map将String类型转换成int类型返回Stream，使用了Function函数
        list.stream().map(Integer::parseInt).forEach(System.out::println);
        //使用mapToInt将String转换成int返回intStream流，使用IntStream中的sum方法
        int sum = list.stream().mapToInt(Integer::parseInt).sum();
        System.out.println(sum);
    }
}
