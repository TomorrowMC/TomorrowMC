package com;

import java.util.Scanner;

/** 
 * @ author Yifei.Hu
 *  @create 2021-09--16:12
 */
public class GreatCircle {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double x1 = Math.toRadians(scan.nextDouble());
        double y1 = Math.toRadians(scan.nextDouble());
        double x2 = Math.toRadians(scan.nextDouble());
        double y2 = Math.toRadians(scan.nextDouble());
        double r = 6371.0;
        double dist = 2*r* Math.asin(Math.sqrt(Math.pow(Math.sin((x2-x1)/2),2)+Math.cos(x1)* Math.cos(x2)*Math.pow(Math.sin((y2-y1)/2),2)));
        System.out.println(dist+" kilometres");
    }
}
