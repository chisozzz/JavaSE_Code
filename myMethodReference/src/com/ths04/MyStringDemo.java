package com.ths04;
/*
    练习
    定义一个接口(MyString)，里面定义一个抽象方法：
        String mySubString(String s,int x,int y);
    定义一个测试类(MyStringDemo)，在测试类中提供两个方法
        一个方法是：useMyString(MyString my)
        一个方法是主方法，在主方法中调用useMyString方法

 */
public class MyStringDemo {
    public static void main(String[] args) {
//        useMyString((String s,int x,int y )->{
//            String s1 = s.substring(x, y);
//            return s1;
//        });
//        useMyString((s,x,y)->s.substring(x,y));
        useMyString(String::substring);
    }

    private static void useMyString(MyString my) {
        String s = my.mySubString("HelloWorld", 2, 5);
        System.out.println(s);
    }
}
