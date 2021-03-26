package com.ths03;

//public class Generic<T> {
//    public void show(T t){
//        System.out.println(t);
//    }
//}
//泛型方法的改进 其实改进了空气，
public class Generic{
    public <T>void show(T t){
        System.out.println(t);
    }
}