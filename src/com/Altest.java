package com;

import java.util.Scanner;

/**
 * @author Yifei.Hu
 * @create 2021-09--17:03
 */
public class Altest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input first int:");
        int first = input.nextInt();
        System.out.print("input second int:");
        int second = input.nextInt();
        if (first>second) {
            System.out.println("first int is bigger");
        }else{
            System.out.println("second int is bigger");
        }
        System.out.println("end");
    }
}
