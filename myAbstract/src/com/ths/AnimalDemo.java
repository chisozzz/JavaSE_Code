package com.ths;

public class AnimalDemo {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.setName("cat");
        c.setAge(3);
        c.show();
        c.eat();

        Dog d  = new Dog("dog", 2);
        d.show();
        d.eat();


    }
}
