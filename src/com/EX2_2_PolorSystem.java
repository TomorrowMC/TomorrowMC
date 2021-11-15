package com;

import java.util.Scanner;

/**
 * @author Yifei.Hu
 * @create 2021-09--15:22
 */
public class EX2_2_PolorSystem {
    public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
       double x =scan.nextDouble();
       double y =scan.nextDouble();
       double r =Math.sqrt( Math.pow(x,2)+Math.pow(y,2));
       double theta = Math.atan(y/x);
        System.out.println("r = "+r);
        System.out.println("theta = "+theta);

    }
}
