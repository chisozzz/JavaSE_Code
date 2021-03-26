package com.ths_04;

public class Zi extends Fu {
    public int age = 20;

    public Zi() {
        System.out.println("Zi类的无参构造方法被调用");
    }

    public void show() {
        int age = 30;
        System.out.println(age);
        System.out.println(this.age);
        System.out.println(super.age);
    }
}
