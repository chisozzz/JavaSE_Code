package com.ths01;
//注解压制警告 value值通常为all
@SuppressWarnings("all")
public class Impl implements Interface01{
    @Override
    public void show() {
        System.out.println("实例");
    }
    @Deprecated
    public void show1(){

    }
    public void show2(){

    }
}
