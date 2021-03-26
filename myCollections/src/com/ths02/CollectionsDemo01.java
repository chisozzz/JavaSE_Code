package com.ths02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
    案例：Collections针对ArrayList存储自定义对象排序
    需求：ArrayList存储自定义对象，使用Collections对ArrayList进行排序
    思路：
    定义学生类
    创建ArrayList集合对象
    创建学生对象
    把学生添加到集合
    使用Collections对ArrayList集合排序
    遍历集合

 */
public class CollectionsDemo01 {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();
        Student s1 = new Student("zhangsan", 22);
        Student s2 = new Student("lisi", 26);
        Student s3 = new Student("wangwu", 27);

        array.add(s1);
        array.add(s2);
        array.add(s3);

        Collections.sort(array, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num= o1.getAge()-o2.getAge();
                int num2= num==0?o1.getName().compareTo(o2.getName()):num;
                return num2;
            }
        });
        for (Student s:array){
            System.out.println(s);
        }
    }
}
