package com.ths_10;

public class  Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }
    public void catchMouse(){
        System.out.println("猫捉老鼠");
    }
}
