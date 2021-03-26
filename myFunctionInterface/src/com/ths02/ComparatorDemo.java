package com.ths02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
    需求
    定义一个类(ComparatorDemo)，在类中提供两个方法
        一个方法是：Comparator<String> getComparator()   方法返回值Comparator是一个函数式接口
        一个方法是主方法，在主方法中调用getComparator方法

    如果方法的返回值是一个函数式接口，我们可以使用Lambda表达式作为结果返回
        private static Comparator<String> getComparator() {
            return (s1, s2) -> s1.length() - s2.length();
        }

 */
public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<String>array=new ArrayList<>();
        array.add("bbb");
        array.add("a");
        array.add("cccc");
        array.add("dd");
        Collections.sort(array);
        System.out.println("排序前："+array);
        Collections.sort(array,getComparator());
        System.out.println("排序后："+array);

    }
    //集合的比较规则Comparator比较器的使用需要用到Collections集合操作类的排序功能
    private static Comparator<String> getComparator() {
        //匿名内部类
//        Comparator<String>comp=new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length()-o2.length();
//            }
//        };
//        return comp;
        return (s1,s2)->s1.length()-s2.length();
//        return (s1, s2) -> s1.length() - s2.length();
    }
}
