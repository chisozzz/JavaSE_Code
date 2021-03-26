package com.ths;
/*
    案例：猫和狗
    需求：请采用多态的思想实现猫和狗的案例，并在测试类中进行测试

 */
public class AnimalDemo {
    public static void main(String[] args) {
        //创建一个父类对象使用子类的重写方法，一般不直接使用而是用于抽象类的继承，子类的功能更多，只是一种类的扩展，
        Animal a=new Cat("cat",2);
        a.show();
        a.eat();

        Animal d = new Dog();
        d.setName("dog");
        d.setAge(3);
        d.show();
        d.eat();
    }
}
