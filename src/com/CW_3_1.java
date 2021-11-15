package com;

import java.util.Scanner;

/**
 * @author Yifei.Hu
 * @create 2021-09--23:54
 */
public class CW_3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean d;
        if (a <= 0 || b <= 0 || c <= 0) {
            d = false;
        }else if(Math.pow(a,2)+Math.pow(b, 2) == Math.pow(c,2)) {
            d=true;
        }else if(Math.pow(c,2)+Math.pow(b, 2) == Math.pow(a,2)) {
            d=true;
        }else if(Math.pow(a,2)+Math.pow(c, 2) == Math.pow(b,2)) {
            d=true;
        }else {
            d = false;
        }
        System.out.println(d);
    }
}
