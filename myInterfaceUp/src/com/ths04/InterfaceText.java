package com.ths04;

public interface InterfaceText {
    void show();
    default void show3(){
        System.out.println("默认犯法被调用了");
    }
    static void show2(){
        System.out.println("静态方法调用了");
    }
}
