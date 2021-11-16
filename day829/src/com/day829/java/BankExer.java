package com.day829.java;


import java.util.concurrent.locks.ReentrantLock;

class account1  implements Runnable {
    private int money=0;
    private ReentrantLock lock = new ReentrantLock();

    public account1() {
    }

    public int getMoney() {
        return money;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            lock.lock();
            money+=1000;
            System.out.println(money);
            lock.unlock();
        }
    }
}


public class BankExer {
    public static void main(String[] args) {
        account1 a1= new account1();
        Thread thread = new Thread(a1);
        Thread thread2 = new Thread(a1);
        thread.start();
        thread2.start();
        System.out.println(a1.getMoney());

    }

}
