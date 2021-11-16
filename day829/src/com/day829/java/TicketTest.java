package com.day829.java;

/**
 * @author Yifei.Hu
 * @create 2021-08--14:23
 */
class windows implements Runnable {
    private int ticket = 100;
    Object obj = new Object();

    @Override
    public void run() {

        synchronized (obj) {
            while (true) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + ":" + ticket);
                    --ticket;
                } else {
                    break;
                }
            }
        }

    }
}

public class TicketTest {
    public static void main(String[] args) {
        windows w1 = new windows();
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
