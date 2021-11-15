package com;

import java.util.Scanner;
/**
 * @author Yifei.Hu
 * @create 2021-09--23:48
 */
public class Exer3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = 0;
        if  (a > 21 && b > 21) {
            c = -1;
        } else if (a > 21 || b > 21) {
            c = (a > b) ? b:a;
        }else{
            c=(21-a>21-b)? b:a;
        }
        System.out.println(c);

    }
}
