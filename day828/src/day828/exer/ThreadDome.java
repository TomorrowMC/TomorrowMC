package day828.exer;

/**
 * @author Yifei.Hu
 * @creat 2021-08--14:29
 */
class Odd extends Thread{
    @Override
    public void run() {
        Thread.currentThread().setName("good");
        
        for (int i = 0; i < 100; i++) {
            if (i%2==1) {
                System.out.println(Thread.currentThread().getName()+i);

            }
        }

    }

}

class Even extends Thread{


    @Override
    public void run() {
        Thread.currentThread().setName("bad");
        for (int i = 0; i < 100; i++) {
            if (i%2==0) {
                System.out.println(Thread.currentThread().getName()+i);
            }

        }

    }
}

public class ThreadDome{
    public static void main(String[] args) {
        Even even = new Even();
        Odd odd = new Odd();
        even.start();
        odd.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("ssd"+i);
            if (i==20) {
                try {
                    even.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}