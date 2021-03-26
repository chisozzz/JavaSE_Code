package com.ths01;
/*
    成员内部类在成员位置创建类
    成员内部类可以访问类中的成员
    外部访问就需要多级访问
    比如System.out.print();
 */
public class StudentDemo {
    Student.Inner si=new Student().new Inner();
}
