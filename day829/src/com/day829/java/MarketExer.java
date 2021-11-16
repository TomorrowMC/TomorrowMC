package com.day829.java;

/**
 * @author Yifei.Hu
 * @create 2021-08--10:28
 */
class product{
    static int number = 0;


}

class Productor implements Runnable{

    @Override
    public void run() {
        while (true) {
            if (product.number<20){

            }
        }
    }
}





public class MarketExer {
    public static void main(String[] args) {
        product product = new product();
        Thread thread = new Thread();
    }
}
