package com.ths04;

public class GenericImpl <T> implements Generic<T> {
//    public GenericImpl() {
//    }

    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
