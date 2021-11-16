package day828.java;

/**
 * @author Yifei.Hu
 * @create 2021-08--17:12
 */
class RunnableThread implements Runnable{

    @Override
    public void run() {
        System.out.println("good");
    }
}
public class ThreadTest1 {
    public static void main(String[] args) {
        RunnableThread r1 = new RunnableThread();
        Thread thread = new Thread(r1);
        thread.start();
    }
}
