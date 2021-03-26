package com.ths10;

public class Customer implements Runnable{
    private Box b;

    public Customer() {
    }

    public Customer(Box b) {
        this.b=b;
    }

    @Override
    public void run() {
        while (true){
            b.get();
        }
    }
}
