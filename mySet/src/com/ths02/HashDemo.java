package com.ths02;

public class HashDemo {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan",22);
        Student s2=new Student("lisi",23);
        //同一对象调用多次hashcode，值相同

        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());
        System.out.println("--------");

        //默认情况下，不同对象不同，但是调用类中重写hashCode方法，可以让不同对象值可以相同
        System.out.println(s2.hashCode());
        System.out.println("--------");
        System.out.println("hello".hashCode());
        System.out.println("world".hashCode());
        System.out.println("java".hashCode());
        System.out.println("--------");

        System.out.println("world".hashCode());
        System.out.println("--------");
        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());
    }
}
