package com.ths04;

import java.util.ArrayList;
import java.util.function.Predicate;

/*
    练习
    String[] strArray = {"林青霞,30", "柳岩,34", "张曼玉,35", "貂蝉,31", "王祖贤,33"};
    字符串数组中有多条信息，请通过Predicate接口的拼装将符合要求的
    字符串筛选到集合ArrayList中，并遍历ArrayList集合
    同时满足如下要求：姓名长度大于2；年龄大于33
    分析
        有两个判断条件,所以需要使用两个Predicate接口,对条件进行判断
        必须同时满足两个条件,所以可以使用and方法连接两个判断条件
 */
public class PredicateTest {
    public static void main(String[] args) {
        String[] strArray = {"林青霞,30", "柳岩,34", "张曼玉,35", "貂蝉,31", "王祖贤,33"};
        ArrayList<String> array = checkString(strArray, s -> s.split(",")[0].length() > 2,
                s -> Integer.parseInt(s.split(",")[1]) > 33);
        for (String s:array){
            System.out.println(s);
        }
    }
    private static ArrayList<String> checkString(String[]strArray, Predicate<String>pre1,Predicate<String>pre2){
        ArrayList<String>array=new ArrayList<>();
        for (String str:strArray){
            if (pre1.and(pre2).test(str)){
                array.add(str);
            }
        }
        return array;
    }
}
