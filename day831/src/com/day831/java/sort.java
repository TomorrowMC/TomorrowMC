package com.day831.java;

import java.util.Arrays;

/**
 * @author Yifei.Hu
 * @create 2021-09--23:07
 */
public class sort {
    public static void main(String[] args) {
        String str1 = "asdfghjkl";
        char[] c1= str1.toCharArray();
        Arrays.sort(c1);
        str1=String.valueOf(c1);
        System.out.println(str1);
    }
}
