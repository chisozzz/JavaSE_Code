package com.ths01;

public interface InterfaceExam {
    void show();
    default void show4() {
        System.out.println("案例的默认方法执行了");
    }
}
