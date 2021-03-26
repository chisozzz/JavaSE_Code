package com.ths04;

public abstract class Animal implements InterfaceText{
    @Override
    public void show() {
        System.out.println("抽象类被调用了");
    }

}
