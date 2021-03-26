package com.ths05;

import java.util.function.Function;

/*
    练习
    String s = "林青霞,30";
    请按照我指定的要求进行操作：
    1:将字符串截取得到数字年龄部分
    2:将上一步的年龄字符串转换成为int类型的数据
    3:将上一步的int数据加70，得到一个int结果，在控制台输出
    请通过Function接口来实现函数拼接

 */
public class FunctionTest {
    public static void main(String[] args) {
        String s = "林青霞,30";
        convern(s,s1 -> Integer.parseInt(s.split(",")[1]),integer -> integer+70);
    }
    private static void convern(String s, Function<String,Integer>fun1,Function<Integer,Integer>fun2){
        Integer i = fun1.andThen(fun2).apply(s);
        System.out.println(i);
    }
}
