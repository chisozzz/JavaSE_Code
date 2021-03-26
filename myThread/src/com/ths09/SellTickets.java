package com.ths09;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTickets implements Runnable {
    private int tickets = 100;
    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();
                if (tickets > 0) {
                    String name = Thread.currentThread().getName();
                    System.out.println(name + "正在卖出第" + tickets + "张票");
                    tickets--;
                }
            } finally {
                lock.unlock();
            }

        }
    }
}
