package com.ths_03;

public class Zi extends Fu{
    public Zi (){
        //默认有个
//        super(2);
        System.out.println("Zi类的无参构造方法被调用");
    }
    public Zi (int x){
//        super(1);
        System.out.println("Zi类的有参构造方法被调用");
    }
}
