package com.ths05;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        convern("666", s -> Integer.parseInt(s));
        convern(100, integer -> String.valueOf(integer));
        convern("100", Integer::parseInt, i -> String.valueOf(i + 566));
    }

    private static void convern(String s, Function<String, Integer> fun1, Function<Integer, String> fun2) {
        String ss = fun1.andThen(fun2).apply(s);
        System.out.println(ss);
    }

    private static void convern(int i, Function<Integer, String> fun) {
        String s = fun.apply(i);
        System.out.println(s);
    }

    private static void convern(String s, Function<String, Integer> fun) {
        int i = fun.apply(s);
        System.out.println(i);
    }
}
