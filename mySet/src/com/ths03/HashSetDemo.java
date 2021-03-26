package com.ths03;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("hello");
        hs.add("world");
        hs.add("java");
        hs.add("world");

        for (String s : hs) {
            System.out.println(s);
        }
    }
}
