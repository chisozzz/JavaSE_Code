package com.ths08;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //使用比较器
//        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
////                int num=Math.addExact(o1.getChinese(), o1.getMath())-Math.addExact(o2.getChinese(), o2.getMath());
//                //主要条件
//                int num=o2.getSum()-o1.getSum();
//                //次要条件 语文 姓名
//                int num2= num==0?o2.getChinese()- o1.getChinese():num;
//                int num3= num2==0?o1.getName().compareTo(o2.getName()):num2;
//                return num3;
//
//            }
//        });
        //重写自然顺序方法
        TreeSet<Student> ts = new TreeSet<>();

        Student s1 = new Student("zhangsan", 99, 100);
        Student s2 = new Student("lisi", 95, 98);
        Student s3 = new Student("wangwu", 89, 99);
        Student s4 = new Student("lurenjia", 99, 98);
        Student s5 = new Student("xiaobingyi", 96, 97);
        Student s6 = new Student("jiangjun", 89, 99);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);

        for (Student s:ts){
            System.out.println(s);
        }
    }
}
