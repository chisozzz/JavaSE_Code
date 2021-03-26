package com.ths01;
/*
    使用类创建对象
    对象属性和方法使用
 */
public class PhoneDemo {
    public static void main(String[] args) {
        Phone p = new Phone();
        //输出p对象的默认属性
        System.out.println(p.brand);
        System.out.println(p.price);
        //使用对象的方法
        p.call();
        p.sendMessage();

        p.brand ="小米";
        p.price = 2999;
        System.out.println(p.brand);
        System.out.println(p.price);
    }
}
