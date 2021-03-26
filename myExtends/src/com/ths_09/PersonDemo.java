package com.ths_09;
/*
    案例：老师和学生
    需求：定义老师类和学生类，然后写代码测试；最后找到老师类和学生类当中的共性内容，抽取出一个父类，
          用继承的方式改写代码，并进行测试
    测试类
 */
public class PersonDemo {
    public static void main(String[] args) {
        Teacher t1=new Teacher();
        t1.setName("zhangsan");
        t1.setAge(23);
        t1.show();

        Teacher t2 =new Teacher("lisi",24);
        t2.show();
        System.out.println("----------");
        Student s =new Student();
        s.setName("wangwu");
        s.setAge(17);
        s.show();

        Student s2=new Student("xiaoming",15);
        s2.show();
    }
}
