package com;

import java.util.Scanner;

/**
 * @author Yifei.Hu
 * @create 2021-09--15:48
 */
public class CW_2_GRB {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double cyan = scan.nextDouble();
        double megenta = scan.nextDouble();
        double yellow = scan.nextDouble();
        double black = scan.nextDouble();
        double white =  (1-black);
        int red = (int) Math.round(255 * white * (1 - cyan));
        int green= (int) Math.round(255 * white * (1 - megenta));
        int blue = (int) Math.round(255*white*(1-yellow));
        System.out.println("red = "+red);
        System.out.println("green = "+green);
        System.out.println("blue = "+blue);

    }
}
