package com.ths03;

import java.util.ArrayList;
import java.util.List;

/*
    Stream<T> sorted()：返回由此流的元素组成的流，根据自然顺序排序
    Stream<T> sorted(Comparator comparator)：返回由该流的元素组成的流，根据提供的Comparator进行排序

 */
public class StreamOperatorDemo02 {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("zhangwuji");
        list.add("zhangmin");
        list.add("lingqinxia");
        list.add("zhangmanyu");
        list.add("wangzuxian");
        list.add("diaocan");
        //自然排序，输出
//        list.stream().sorted().forEach(System.out::println);
        //按照姓名长度排序，输出
//        list.stream().sorted((s1,s2)->s1.length()-s2.length()).forEach(System.out::println);
        //按照姓名长度排序，长度相同按字母排序，输出
        list.stream().sorted((s1,s2)->{
            int num=s1.length()-s2.length();
            int num2=num==0?s1.compareTo(s2):num;
            return num2;
        }).forEach(System.out::println);
    }
}
