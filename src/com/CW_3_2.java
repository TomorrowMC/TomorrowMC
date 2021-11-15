package com;

import java.util.Scanner;

/**
 * @author Yifei.Hu
 * @create 2021-09--13:45
 */
public class CW_3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int step = 1;
        int i = input.nextInt();
        while (i != 1) {
            if (i%2==0) {
                i/=2;
            }else{
                i = 3*i+1;
            }
            step++;
        }
        System.out.println(step);
    }
}
