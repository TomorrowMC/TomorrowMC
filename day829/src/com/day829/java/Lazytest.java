package com.day829.java;

/**
 * @author Yifei.Hu
 * @create 2021-08--15:48
 */
class Lazy {
    Lazy lazy=null;
    private Lazy() {
    }
public Lazy returnLazy(){

    synchronized (Lazy.class) {
        if (lazy == null) {
            Lazy lazy = new Lazy();
        }

        return lazy;
    }
}


}


public class Lazytest {
}
