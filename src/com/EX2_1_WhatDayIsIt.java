package com;

import java.util.Scanner;

/**
 * @author Yifei.Hu
 * @create 2021-09--15:13
 */
public class EX2_1_WhatDayIsIt{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int y = scan.nextInt();
        int m = scan.nextInt();
        int d = scan.nextInt();
        int a = y - ((14 - m) / 12);
        int b = a + a / 4 - a / 100 + a / 400;
        int c = m +12 *((14-m)/12)-2;;
        int day = (d+b+(31*c)/12)%7;
        System.out.println("It's day "+day+" !");
    }

}
