package com.ths;

public class MethodDemo {
    public static void main(String[] args) {
        print();

        isEventNumber();
    }
    public static void print(){
        System.out.println("HelloWorld");
    }
    public static void isEventNumber(){
        int number = 10;
        if (number % 2 == 0){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
