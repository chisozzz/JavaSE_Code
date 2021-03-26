package com.ths02;

public class GenericDemo {
    public static void main(String[] args) {
        Student s = new Student("zhangsan");
        System.out.println(s.getName());

        //泛型类使用
        Generic<String> st = new Generic<>();
        st.setT("wangwu");
        System.out.println(st.getT());

    }
}
