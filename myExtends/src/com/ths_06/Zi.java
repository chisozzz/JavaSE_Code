package com.ths_06;

public class Zi extends Fu  {
    /*@Override重写出错，子类不能重写private方法
    public void show(){
        System.out.println("Zi类的show方法被调用");
    }*/
//    @Override重写出错，子类的权限比父类权限小
//    private void method(){
//        System.out.println("Zi类的method方法被调用");
//    }
    @Override//没有权限词，系统自动默认一个 public>默认>private
    void show(){
        System.out.println("ss");
    }
    @Override
    public void method(){
        System.out.println("Zi类的method方法被调用");
    }
}
