package com.day829.java;

/**
 * @author Yifei.Hu
 * @create 2021-08--10:25
 */
public class LazyInstance {
    private static LazyInstance lz1 =null;

    private LazyInstance() {
    }

    public static LazyInstance getInstance(){
        if (lz1==null) {
            synchronized (LazyInstance.class) {
                if (lz1==null) {
                    lz1 = new LazyInstance();
                }
            }
        }
        return lz1;
    }
}
