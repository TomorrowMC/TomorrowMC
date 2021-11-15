package com;

import java.util.Scanner;

/**
 * @author Yifei.Hu
 * @create 2021-10--00:07
 */
public class EX3_2 {
    public static void main(String[] args) throws Exception{
        Scanner scanner= new Scanner(System.in);
        int init= scanner.nextInt();
        int numInfect =scanner.nextInt();
        int population = scanner.nextInt();
        int now=init;
        int day =1;
        while (now<population) {
            now+= (int) (now*numInfect);
            day++;
        }
        System.out.println(day);
    }


}
