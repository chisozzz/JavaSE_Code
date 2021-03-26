package com.ths_01;
/*
    案例；猫和狗
    需求：对猫和狗进行训练，他们就可以跳高了，这里加入跳高功能。请采用抽象类和接口来实现猫狗案例，
          并在测试类中进行测试

 */
public class AnimalDemo {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.setName("cat");
        c.setAge(2);
        c.show();
        c.jump();

        Dog d = new Dog("dog", 3);
        d.show();
        d.jump();

    }
}
