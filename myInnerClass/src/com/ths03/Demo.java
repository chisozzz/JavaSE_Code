package com.ths03;

public class Demo {
    public static void main(String[] args) {
        JumppingOperate jo =new JumppingOperate();
        Jumpping j =new Cat();
        jo.method(j);
        System.out.println("--------");
        //以下使用不需创建实例类就可以访问，使用了隐匿内部类
        jo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("狗可以跳高了");
            }
        });
        //隐匿内部类实例化
        Jumpping jump =new Jumpping() {
            @Override
            public void jump() {

            }
        };
        jo.method(jump);
    }
}
