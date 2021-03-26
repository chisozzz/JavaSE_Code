package com.ths10;

public class Producer implements Runnable {
    private Box b;

    public Producer() {
    }

    public Producer(Box b) {
        this.b=b;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            b.store(i);
        }
    }
}
