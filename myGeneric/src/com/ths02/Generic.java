package com.ths02;
/*
    泛型类的构造
 */
public class Generic<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public Generic() {
    }

    public Generic(T t) {
        this.t = t;
    }
}
