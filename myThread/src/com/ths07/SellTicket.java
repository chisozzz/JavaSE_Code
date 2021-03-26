package com.ths07;
/*

 */
public class SellTicket implements Runnable{
    private static int tickets=100;
    private Object obj=new Object();
    private int x=0;
    @Override
    public void run() {
        while (true){
            if (x%2==0) {
                synchronized (SellTicket.class) {
                    if (tickets > 0) {
                        String name = Thread.currentThread().getName();
                        System.out.println(name + "正在卖出第" + tickets + "张票");
                        tickets--;
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }else {
//                synchronized (obj) {
//                    if (tickets > 0) {
//                        String name = Thread.currentThread().getName();
//                        System.out.println(name + "正在卖出第" + tickets + "张票");
//                        tickets--;
//                        try {
//                            Thread.sleep(100);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                }
                sellTickets();
            }
            x++;
        }

    }

    private static synchronized void sellTickets() {
//        synchronized (obj) {
            if (tickets > 0) {
                String name = Thread.currentThread().getName();
                System.out.println(name + "正在卖出第" + tickets + "张票");
                tickets--;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

    }
}
