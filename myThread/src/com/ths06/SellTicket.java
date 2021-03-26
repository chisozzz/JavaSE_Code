package com.ths06;
/*
    定义一个类SellTicket实现Runnable接口，里面定义一个成员变量：private int tickets = 100;
    在SellTicket类中重写run()方法实现卖票，代码步骤如下
    A：判断票数大于0，就卖票，并告知是哪个窗口卖的
    B：卖了票之后，总票数要减1
    C：票没有了，也可能有人来问，所以这里用死循环让卖票的动作一直执行
 */
public class SellTicket implements Runnable{
    private int tickets=100;

    @Override
    public void run() {
        while (true){
            if (tickets>0){
                String name = Thread.currentThread().getName();
                System.out.println(name+"正在卖出第"+tickets+"张票");
                tickets--;

            }
        }

    }
}
