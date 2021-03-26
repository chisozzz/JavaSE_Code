package com.ths;

public class Student {
    //非静态成员
    private String name;
    private int age;
    //静态成员
    private static String university;
    //非静态成员方法
    public void show(){
        System.out.println(name);
        System.out.println(university);
        show1();
        show3();
//        System.out.println(name+","+age+","+university);
    }
    public void show3(){

    }
    //静态成员方法
    public static void show1(){
    }
    public static void show2(){
//        System.out.println(name);非静态不能调用
        System.out.println(university);
        show1();
//        show3();
    }

    public Student() {
    }

    public Student(String name, int age, String university) {
        this.name = name;
        this.age = age;
        this.university = university;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

}
