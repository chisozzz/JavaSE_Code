package com.ths04;
/*
    接口中静态方法的定义格式：
    格式：public static 返回值类型 方法名(参数列表) {   }
    范例： public static void show() {   }

 */
public class StaticDemo {
    public static void main(String[] args) {
        InterfaceText it=new InterfaceImpl();
        it.show();
        it.show3();
        //静态方法不能通过实例调用，只能使用接口直接调用
        InterfaceText.show2();
    }

}
