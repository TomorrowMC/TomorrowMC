package com.day829.java;


class windows3 implements Runnable {
    private static int ticket = 100;

    @Override
    public void run() {
        while (true) {
            show();
        }
    }

    public synchronized void show() {
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + ":" + ticket);
            --ticket;
        } else {
            Thread.currentThread().stop();
        }
    }
}


public class TicketTest3 {
    public static void main(String[] args) {
        windows3 w1 = new windows3();
        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w1);
        Thread t3 = new Thread(w1);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();

    }
}

