package com.ths_05;

public class NewPhone extends Phone {
    //@Override是一个注解用于效验重写是否正确
    @Override
    public void call(){
        System.out.println("开启视频功能");
        super.call();
    }
}
