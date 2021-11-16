package com.day829.java;

/**
 * @author Yifei.Hu
 * @create 2021-08--14:23
 */
class windows2 implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
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

public class Ticktest2 {
    public static void main(String[] args) {
        windows2 w1 = new windows2();
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


