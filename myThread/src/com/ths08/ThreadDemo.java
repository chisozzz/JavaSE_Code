package com.ths08;

import java.util.*;

public class ThreadDemo {
    public static void main(String[] args) {
        StringBuffer sb =new StringBuffer();
        StringBuilder sb2 =new StringBuilder();

        Vector<String>vec =new Vector<>();
        ArrayList<String>array =new ArrayList<>();

        Hashtable<String,String>ht =new Hashtable<>();
        HashMap<String,String>hm =new HashMap<>();

        List<String> list = Collections.synchronizedList(new ArrayList<String>());
        Set<String> strings = Collections.synchronizedSet(new TreeSet<String>());
        Collections.synchronizedMap(new HashMap<String,String>());
    }
}
