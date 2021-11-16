package com.day906.java;

/**
 * @author Yifei.Hu
 * @create 2021-09--14:57
 */
enum Stusts{
    BUSY,GOOD,VOCATION
}
public class enumTEst {
    public static void main(String[] args) {
        Stusts s1= Stusts.BUSY;
        switch (s1){
            case BUSY -> System.out.println("111");
            case GOOD -> System.out.println("1");
            case VOCATION -> System.out.println("121");
        }
    }
}
