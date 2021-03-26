package com.ths01;
/*
    Lambda表达式的使用前提
    有一个接口
    接口中有且仅有一个抽象方法

    练习1：
    定义一个接口(Eatable)，里面定义一个抽象方法：void eat();
    定义一个测试类(EatableDemo)，在测试类中提供两个方法
    一个方法是：useEatable(Eatable e)
    一个方法是主方法，在主方法中调用useEatable方法
 */
public class LambdaDmeo {
    public static void main(String[] args) {
        Eatable e=new EatableImpl();
        useEatable(e);

        useEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("一天一苹果，医生远离我");
            }
        });

        useEatable(() ->{
            System.out.println("一天一苹果，医生远离我");
        });

    }
    private static void useEatable(Eatable e){
        e.eat();
    }
}
