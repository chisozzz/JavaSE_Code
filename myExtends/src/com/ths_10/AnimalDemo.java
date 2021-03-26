package com.ths_10;
/*
    案例：猫和狗
    需求：请采用继承的思想实现猫和狗的案例，并在测试类中进行测试

 */
public class AnimalDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("cat");
        cat.setAge(2);
        cat.show();

        Cat cat1 = new Cat("cat", 2);
        cat.show();
        System.out.println("----------");
        Dog dog = new Dog();
        dog.setName("dog");
        dog.setAge(3);
        dog.show();
        Dog dog1 = new Dog("dog", 3);
        dog1.show();

    }
}
