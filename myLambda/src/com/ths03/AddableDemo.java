package com.ths03;

public class AddableDemo {
    public static void main(String[] args) {
        useAddable((int a,int b)->{
            int sum=a+b;
            System.out.println(sum);
            return sum;
        });
    }
    private static void useAddable(Addable a ){
        int sum= a.add(10,20);

    }
}
