package com;

/**
 * @author Yifei.Hu
 * @create 2021-10--14:31
 */
public class CW_5_1 {
    public static void main(String[] args) {
        System.out.println(sandwichFillings("breadtunabread"));
        System.out.println(sandwichFillings("chipsbreadtunasalad"));
    }

    public static String sandwichFillings(String input){
        int i = input.indexOf("bread");
        int j = input.lastIndexOf("bread");
        if (i==j ||( i==-1||j==-1)) {
            return "none";
        }
        String sb = input.substring(i+"bread".length(),j);
        return sb;

    }
}
